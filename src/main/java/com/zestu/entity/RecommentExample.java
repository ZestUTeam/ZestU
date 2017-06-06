package com.zestu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecommentExample() {
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

        public Criteria andRnoIsNull() {
            addCriterion("rno is null");
            return (Criteria) this;
        }

        public Criteria andRnoIsNotNull() {
            addCriterion("rno is not null");
            return (Criteria) this;
        }

        public Criteria andRnoEqualTo(Integer value) {
            addCriterion("rno =", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotEqualTo(Integer value) {
            addCriterion("rno <>", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThan(Integer value) {
            addCriterion("rno >", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("rno >=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThan(Integer value) {
            addCriterion("rno <", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoLessThanOrEqualTo(Integer value) {
            addCriterion("rno <=", value, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoIn(List<Integer> values) {
            addCriterion("rno in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotIn(List<Integer> values) {
            addCriterion("rno not in", values, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoBetween(Integer value1, Integer value2) {
            addCriterion("rno between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andRnoNotBetween(Integer value1, Integer value2) {
            addCriterion("rno not between", value1, value2, "rno");
            return (Criteria) this;
        }

        public Criteria andRdateIsNull() {
            addCriterion("rdate is null");
            return (Criteria) this;
        }

        public Criteria andRdateIsNotNull() {
            addCriterion("rdate is not null");
            return (Criteria) this;
        }

        public Criteria andRdateEqualTo(Date value) {
            addCriterion("rdate =", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotEqualTo(Date value) {
            addCriterion("rdate <>", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThan(Date value) {
            addCriterion("rdate >", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateGreaterThanOrEqualTo(Date value) {
            addCriterion("rdate >=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThan(Date value) {
            addCriterion("rdate <", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateLessThanOrEqualTo(Date value) {
            addCriterion("rdate <=", value, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateIn(List<Date> values) {
            addCriterion("rdate in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotIn(List<Date> values) {
            addCriterion("rdate not in", values, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateBetween(Date value1, Date value2) {
            addCriterion("rdate between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRdateNotBetween(Date value1, Date value2) {
            addCriterion("rdate not between", value1, value2, "rdate");
            return (Criteria) this;
        }

        public Criteria andRcontentIsNull() {
            addCriterion("rcontent is null");
            return (Criteria) this;
        }

        public Criteria andRcontentIsNotNull() {
            addCriterion("rcontent is not null");
            return (Criteria) this;
        }

        public Criteria andRcontentEqualTo(String value) {
            addCriterion("rcontent =", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotEqualTo(String value) {
            addCriterion("rcontent <>", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentGreaterThan(String value) {
            addCriterion("rcontent >", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentGreaterThanOrEqualTo(String value) {
            addCriterion("rcontent >=", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLessThan(String value) {
            addCriterion("rcontent <", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLessThanOrEqualTo(String value) {
            addCriterion("rcontent <=", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentLike(String value) {
            addCriterion("rcontent like", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotLike(String value) {
            addCriterion("rcontent not like", value, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentIn(List<String> values) {
            addCriterion("rcontent in", values, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotIn(List<String> values) {
            addCriterion("rcontent not in", values, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentBetween(String value1, String value2) {
            addCriterion("rcontent between", value1, value2, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRcontentNotBetween(String value1, String value2) {
            addCriterion("rcontent not between", value1, value2, "rcontent");
            return (Criteria) this;
        }

        public Criteria andRaidIsNull() {
            addCriterion("raid is null");
            return (Criteria) this;
        }

        public Criteria andRaidIsNotNull() {
            addCriterion("raid is not null");
            return (Criteria) this;
        }

        public Criteria andRaidEqualTo(Integer value) {
            addCriterion("raid =", value, "raid");
            return (Criteria) this;
        }

        public Criteria andRaidNotEqualTo(Integer value) {
            addCriterion("raid <>", value, "raid");
            return (Criteria) this;
        }

        public Criteria andRaidGreaterThan(Integer value) {
            addCriterion("raid >", value, "raid");
            return (Criteria) this;
        }

        public Criteria andRaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("raid >=", value, "raid");
            return (Criteria) this;
        }

        public Criteria andRaidLessThan(Integer value) {
            addCriterion("raid <", value, "raid");
            return (Criteria) this;
        }

        public Criteria andRaidLessThanOrEqualTo(Integer value) {
            addCriterion("raid <=", value, "raid");
            return (Criteria) this;
        }

        public Criteria andRaidIn(List<Integer> values) {
            addCriterion("raid in", values, "raid");
            return (Criteria) this;
        }

        public Criteria andRaidNotIn(List<Integer> values) {
            addCriterion("raid not in", values, "raid");
            return (Criteria) this;
        }

        public Criteria andRaidBetween(Integer value1, Integer value2) {
            addCriterion("raid between", value1, value2, "raid");
            return (Criteria) this;
        }

        public Criteria andRaidNotBetween(Integer value1, Integer value2) {
            addCriterion("raid not between", value1, value2, "raid");
            return (Criteria) this;
        }

        public Criteria andRcidIsNull() {
            addCriterion("rcid is null");
            return (Criteria) this;
        }

        public Criteria andRcidIsNotNull() {
            addCriterion("rcid is not null");
            return (Criteria) this;
        }

        public Criteria andRcidEqualTo(Integer value) {
            addCriterion("rcid =", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidNotEqualTo(Integer value) {
            addCriterion("rcid <>", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidGreaterThan(Integer value) {
            addCriterion("rcid >", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcid >=", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidLessThan(Integer value) {
            addCriterion("rcid <", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidLessThanOrEqualTo(Integer value) {
            addCriterion("rcid <=", value, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidIn(List<Integer> values) {
            addCriterion("rcid in", values, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidNotIn(List<Integer> values) {
            addCriterion("rcid not in", values, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidBetween(Integer value1, Integer value2) {
            addCriterion("rcid between", value1, value2, "rcid");
            return (Criteria) this;
        }

        public Criteria andRcidNotBetween(Integer value1, Integer value2) {
            addCriterion("rcid not between", value1, value2, "rcid");
            return (Criteria) this;
        }

        public Criteria andRuidIsNull() {
            addCriterion("ruid is null");
            return (Criteria) this;
        }

        public Criteria andRuidIsNotNull() {
            addCriterion("ruid is not null");
            return (Criteria) this;
        }

        public Criteria andRuidEqualTo(Integer value) {
            addCriterion("ruid =", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidNotEqualTo(Integer value) {
            addCriterion("ruid <>", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidGreaterThan(Integer value) {
            addCriterion("ruid >", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ruid >=", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidLessThan(Integer value) {
            addCriterion("ruid <", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidLessThanOrEqualTo(Integer value) {
            addCriterion("ruid <=", value, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidIn(List<Integer> values) {
            addCriterion("ruid in", values, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidNotIn(List<Integer> values) {
            addCriterion("ruid not in", values, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidBetween(Integer value1, Integer value2) {
            addCriterion("ruid between", value1, value2, "ruid");
            return (Criteria) this;
        }

        public Criteria andRuidNotBetween(Integer value1, Integer value2) {
            addCriterion("ruid not between", value1, value2, "ruid");
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