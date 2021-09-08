package main.dto;

import main.model.MembershipEntity;

import java.util.Date;

public class PersonDTO {

    private Integer p_id;

    private Integer member_type;

    private String first_name;

    private String last_name;

    private Date birthday;

    private String occupation;

    private String buisness;

    private boolean isActive;

    private String nickName;

    public PersonDTO() {
    }

    public PersonDTO(Integer p_id, Integer member_type, String first_name, String last_name, Date birthday,
                     String occupation, String buisness, boolean isActive, String nickName) {
        this.p_id = p_id;
        this.member_type = member_type;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birthday = birthday;
        this.occupation = occupation;
        this.buisness = buisness;
        this.isActive = isActive;
        this.nickName = nickName;
    }

    public Integer getP_id() {
        return p_id;
    }

    public void setP_id(Integer p_id) {
        this.p_id = p_id;
    }

    public Integer getMember_type() {
        return member_type;
    }

    public void setMember_type(Integer member_type) {
        this.member_type = member_type;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getBuisness() {
        return buisness;
    }

    public void setBuisness(String buisness) {
        this.buisness = buisness;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

//    public MembershipEntity getMembershipByMsId() {
//        return membershipByMsId;
//    }
//
//    public void setMembershipByMsId(MembershipEntity membershipByMsId) {
//        this.membershipByMsId = membershipByMsId;
//    }
}
