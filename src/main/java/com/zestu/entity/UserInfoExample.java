package com.zestu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUnoIsNull() {
            addCriterion("uno is null");
            return (Criteria) this;
        }

        public Criteria andUnoIsNotNull() {
            addCriterion("uno is not null");
            return (Criteria) this;
        }

        public Criteria andUnoEqualTo(Integer value) {
            addCriterion("uno =", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotEqualTo(Integer value) {
            addCriterion("uno <>", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoGreaterThan(Integer value) {
            addCriterion("uno >", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("uno >=", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLessThan(Integer value) {
            addCriterion("uno <", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoLessThanOrEqualTo(Integer value) {
            addCriterion("uno <=", value, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoIn(List<Integer> values) {
            addCriterion("uno in", values, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotIn(List<Integer> values) {
            addCriterion("uno not in", values, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoBetween(Integer value1, Integer value2) {
            addCriterion("uno between", value1, value2, "uno");
            return (Criteria) this;
        }

        public Criteria andUnoNotBetween(Integer value1, Integer value2) {
            addCriterion("uno not between", value1, value2, "uno");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUsignIsNull() {
            addCriterion("usign is null");
            return (Criteria) this;
        }

        public Criteria andUsignIsNotNull() {
            addCriterion("usign is not null");
            return (Criteria) this;
        }

        public Criteria andUsignEqualTo(Integer value) {
            addCriterion("usign =", value, "usign");
            return (Criteria) this;
        }

        public Criteria andUsignNotEqualTo(Integer value) {
            addCriterion("usign <>", value, "usign");
            return (Criteria) this;
        }

        public Criteria andUsignGreaterThan(Integer value) {
            addCriterion("usign >", value, "usign");
            return (Criteria) this;
        }

        public Criteria andUsignGreaterThanOrEqualTo(Integer value) {
            addCriterion("usign >=", value, "usign");
            return (Criteria) this;
        }

        public Criteria andUsignLessThan(Integer value) {
            addCriterion("usign <", value, "usign");
            return (Criteria) this;
        }

        public Criteria andUsignLessThanOrEqualTo(Integer value) {
            addCriterion("usign <=", value, "usign");
            return (Criteria) this;
        }

        public Criteria andUsignIn(List<Integer> values) {
            addCriterion("usign in", values, "usign");
            return (Criteria) this;
        }

        public Criteria andUsignNotIn(List<Integer> values) {
            addCriterion("usign not in", values, "usign");
            return (Criteria) this;
        }

        public Criteria andUsignBetween(Integer value1, Integer value2) {
            addCriterion("usign between", value1, value2, "usign");
            return (Criteria) this;
        }

        public Criteria andUsignNotBetween(Integer value1, Integer value2) {
            addCriterion("usign not between", value1, value2, "usign");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("uemail is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("uemail is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("uemail =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("uemail <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("uemail >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("uemail >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("uemail <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("uemail <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("uemail like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("uemail not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("uemail in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("uemail not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("uemail between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("uemail not between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUiconIsNull() {
            addCriterion("uicon is null");
            return (Criteria) this;
        }

        public Criteria andUiconIsNotNull() {
            addCriterion("uicon is not null");
            return (Criteria) this;
        }

        public Criteria andUiconEqualTo(String value) {
            addCriterion("uicon =", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconNotEqualTo(String value) {
            addCriterion("uicon <>", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconGreaterThan(String value) {
            addCriterion("uicon >", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconGreaterThanOrEqualTo(String value) {
            addCriterion("uicon >=", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconLessThan(String value) {
            addCriterion("uicon <", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconLessThanOrEqualTo(String value) {
            addCriterion("uicon <=", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconLike(String value) {
            addCriterion("uicon like", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconNotLike(String value) {
            addCriterion("uicon not like", value, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconIn(List<String> values) {
            addCriterion("uicon in", values, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconNotIn(List<String> values) {
            addCriterion("uicon not in", values, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconBetween(String value1, String value2) {
            addCriterion("uicon between", value1, value2, "uicon");
            return (Criteria) this;
        }

        public Criteria andUiconNotBetween(String value1, String value2) {
            addCriterion("uicon not between", value1, value2, "uicon");
            return (Criteria) this;
        }

        public Criteria andUbirthdayIsNull() {
            addCriterion("ubirthday is null");
            return (Criteria) this;
        }

        public Criteria andUbirthdayIsNotNull() {
            addCriterion("ubirthday is not null");
            return (Criteria) this;
        }

        public Criteria andUbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday =", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday <>", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("ubirthday >", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday >=", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("ubirthday <", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ubirthday <=", value, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("ubirthday in", values, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("ubirthday not in", values, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ubirthday between", value1, value2, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ubirthday not between", value1, value2, "ubirthday");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNull() {
            addCriterion("uphone is null");
            return (Criteria) this;
        }

        public Criteria andUphoneIsNotNull() {
            addCriterion("uphone is not null");
            return (Criteria) this;
        }

        public Criteria andUphoneEqualTo(String value) {
            addCriterion("uphone =", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotEqualTo(String value) {
            addCriterion("uphone <>", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThan(String value) {
            addCriterion("uphone >", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneGreaterThanOrEqualTo(String value) {
            addCriterion("uphone >=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThan(String value) {
            addCriterion("uphone <", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLessThanOrEqualTo(String value) {
            addCriterion("uphone <=", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneLike(String value) {
            addCriterion("uphone like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotLike(String value) {
            addCriterion("uphone not like", value, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneIn(List<String> values) {
            addCriterion("uphone in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotIn(List<String> values) {
            addCriterion("uphone not in", values, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneBetween(String value1, String value2) {
            addCriterion("uphone between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUphoneNotBetween(String value1, String value2) {
            addCriterion("uphone not between", value1, value2, "uphone");
            return (Criteria) this;
        }

        public Criteria andUdescriptionIsNull() {
            addCriterion("udescription is null");
            return (Criteria) this;
        }

        public Criteria andUdescriptionIsNotNull() {
            addCriterion("udescription is not null");
            return (Criteria) this;
        }

        public Criteria andUdescriptionEqualTo(String value) {
            addCriterion("udescription =", value, "udescription");
            return (Criteria) this;
        }

        public Criteria andUdescriptionNotEqualTo(String value) {
            addCriterion("udescription <>", value, "udescription");
            return (Criteria) this;
        }

        public Criteria andUdescriptionGreaterThan(String value) {
            addCriterion("udescription >", value, "udescription");
            return (Criteria) this;
        }

        public Criteria andUdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("udescription >=", value, "udescription");
            return (Criteria) this;
        }

        public Criteria andUdescriptionLessThan(String value) {
            addCriterion("udescription <", value, "udescription");
            return (Criteria) this;
        }

        public Criteria andUdescriptionLessThanOrEqualTo(String value) {
            addCriterion("udescription <=", value, "udescription");
            return (Criteria) this;
        }

        public Criteria andUdescriptionLike(String value) {
            addCriterion("udescription like", value, "udescription");
            return (Criteria) this;
        }

        public Criteria andUdescriptionNotLike(String value) {
            addCriterion("udescription not like", value, "udescription");
            return (Criteria) this;
        }

        public Criteria andUdescriptionIn(List<String> values) {
            addCriterion("udescription in", values, "udescription");
            return (Criteria) this;
        }

        public Criteria andUdescriptionNotIn(List<String> values) {
            addCriterion("udescription not in", values, "udescription");
            return (Criteria) this;
        }

        public Criteria andUdescriptionBetween(String value1, String value2) {
            addCriterion("udescription between", value1, value2, "udescription");
            return (Criteria) this;
        }

        public Criteria andUdescriptionNotBetween(String value1, String value2) {
            addCriterion("udescription not between", value1, value2, "udescription");
            return (Criteria) this;
        }

        public Criteria andUexperienceIsNull() {
            addCriterion("uexperience is null");
            return (Criteria) this;
        }

        public Criteria andUexperienceIsNotNull() {
            addCriterion("uexperience is not null");
            return (Criteria) this;
        }

        public Criteria andUexperienceEqualTo(Integer value) {
            addCriterion("uexperience =", value, "uexperience");
            return (Criteria) this;
        }

        public Criteria andUexperienceNotEqualTo(Integer value) {
            addCriterion("uexperience <>", value, "uexperience");
            return (Criteria) this;
        }

        public Criteria andUexperienceGreaterThan(Integer value) {
            addCriterion("uexperience >", value, "uexperience");
            return (Criteria) this;
        }

        public Criteria andUexperienceGreaterThanOrEqualTo(Integer value) {
            addCriterion("uexperience >=", value, "uexperience");
            return (Criteria) this;
        }

        public Criteria andUexperienceLessThan(Integer value) {
            addCriterion("uexperience <", value, "uexperience");
            return (Criteria) this;
        }

        public Criteria andUexperienceLessThanOrEqualTo(Integer value) {
            addCriterion("uexperience <=", value, "uexperience");
            return (Criteria) this;
        }

        public Criteria andUexperienceIn(List<Integer> values) {
            addCriterion("uexperience in", values, "uexperience");
            return (Criteria) this;
        }

        public Criteria andUexperienceNotIn(List<Integer> values) {
            addCriterion("uexperience not in", values, "uexperience");
            return (Criteria) this;
        }

        public Criteria andUexperienceBetween(Integer value1, Integer value2) {
            addCriterion("uexperience between", value1, value2, "uexperience");
            return (Criteria) this;
        }

        public Criteria andUexperienceNotBetween(Integer value1, Integer value2) {
            addCriterion("uexperience not between", value1, value2, "uexperience");
            return (Criteria) this;
        }

        public Criteria andUgetIsNull() {
            addCriterion("uget is null");
            return (Criteria) this;
        }

        public Criteria andUgetIsNotNull() {
            addCriterion("uget is not null");
            return (Criteria) this;
        }

        public Criteria andUgetEqualTo(Integer value) {
            addCriterion("uget =", value, "uget");
            return (Criteria) this;
        }

        public Criteria andUgetNotEqualTo(Integer value) {
            addCriterion("uget <>", value, "uget");
            return (Criteria) this;
        }

        public Criteria andUgetGreaterThan(Integer value) {
            addCriterion("uget >", value, "uget");
            return (Criteria) this;
        }

        public Criteria andUgetGreaterThanOrEqualTo(Integer value) {
            addCriterion("uget >=", value, "uget");
            return (Criteria) this;
        }

        public Criteria andUgetLessThan(Integer value) {
            addCriterion("uget <", value, "uget");
            return (Criteria) this;
        }

        public Criteria andUgetLessThanOrEqualTo(Integer value) {
            addCriterion("uget <=", value, "uget");
            return (Criteria) this;
        }

        public Criteria andUgetIn(List<Integer> values) {
            addCriterion("uget in", values, "uget");
            return (Criteria) this;
        }

        public Criteria andUgetNotIn(List<Integer> values) {
            addCriterion("uget not in", values, "uget");
            return (Criteria) this;
        }

        public Criteria andUgetBetween(Integer value1, Integer value2) {
            addCriterion("uget between", value1, value2, "uget");
            return (Criteria) this;
        }

        public Criteria andUgetNotBetween(Integer value1, Integer value2) {
            addCriterion("uget not between", value1, value2, "uget");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}