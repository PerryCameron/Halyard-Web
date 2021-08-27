/**
 * http://stackoverflow.com/a/10997390/11236
 */
function setGetParameter(paramName, paramValue)
{
    console.log("function is being called");
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

function testParameter()
{
    console.log("this worked")
}