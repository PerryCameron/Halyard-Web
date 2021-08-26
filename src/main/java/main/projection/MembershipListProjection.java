package main.projection;

import java.sql.Date;

// select id.membershipId , m.joinDate ,p.fName,p.lName, id.memType, m.address, m.city, m.state, m.zip
// from MembershipEntity m
// inner join MembershipIdEntity id on m.msId=id.membershipByMsId.msId
// inner join PersonEntity p on m.msId=p.membershipByMsId.msId
// where id.fiscalYear=2021 and id.renew=true and p.memberType=1

public interface MembershipListProjection {
    int getMembershipId();
    Date getJoinDate();
    String getFName();
    String getLName();
    String getMemType();
    String getAddress();
    String getCity();
    String getState();
    String getZip();
}
