
function setGetParameter(paramName, paramValue)
{
    var url = window.location.href;
    var hash = location.hash;
    url = url.replace(hash, '');
    if (url.indexOf("?") >= 0)
    {
        var params = url.substring(url.indexOf("?") + 1).split("&");
        var paramFound = false;
        params.forEach(function(param, index) {
            var p = param.split("=");
            if (p[0] == paramName) {
                params[index] = paramName + "=" + paramValue;
                paramFound = true;
            }
        });
        if (!paramFound) params.push(paramName + "=" + paramValue);
        url = url.substring(0, url.indexOf("?")+1) + params.join("&");
    }
    else
        url += "?" + paramName + "=" + paramValue;
    window.location.href = url + hash;
}

function getParameter()
{
    const queryString = window.location.search;
    const urlParams = new URLSearchParams(queryString);
    const product = urlParams.get('year');
    return product;
}
