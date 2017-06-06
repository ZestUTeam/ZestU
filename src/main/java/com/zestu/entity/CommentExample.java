package com.zestu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCnoIsNull() {
            addCriterion("cno is null");
            return (Criteria) this;
        }

        public Criteria andCnoIsNotNull() {
            addCriterion("cno is not null");
            return (Criteria) this;
        }

        public Criteria andCnoEqualTo(Integer value) {
            addCriterion("cno =", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotEqualTo(Integer value) {
            addCriterion("cno <>", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThan(Integer value) {
            addCriterion("cno >", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("cno >=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThan(Integer value) {
            addCriterion("cno <", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoLessThanOrEqualTo(Integer value) {
            addCriterion("cno <=", value, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoIn(List<Integer> values) {
            addCriterion("cno in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotIn(List<Integer> values) {
            addCriterion("cno not in", values, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoBetween(Integer value1, Integer value2) {
            addCriterion("cno between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCnoNotBetween(Integer value1, Integer value2) {
            addCriterion("cno not between", value1, value2, "cno");
            return (Criteria) this;
        }

        public Criteria andCdateIsNull() {
            addCriterion("cdate is null");
            return (Criteria) this;
        }

        public Criteria andCdateIsNotNull() {
            addCriterion("cdate is not null");
            return (Criteria) this;
        }

        public Criteria andCdateEqualTo(Date value) {
            addCriterion("cdate =", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotEqualTo(Date value) {
            addCriterion("cdate <>", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThan(Date value) {
            addCriterion("cdate >", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cdate >=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThan(Date value) {
            addCriterion("cdate <", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateLessThanOrEqualTo(Date value) {
            addCriterion("cdate <=", value, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateIn(List<Date> values) {
            addCriterion("cdate in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotIn(List<Date> values) {
            addCriterion("cdate not in", values, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateBetween(Date value1, Date value2) {
            addCriterion("cdate between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCdateNotBetween(Date value1, Date value2) {
            addCriterion("cdate not between", value1, value2, "cdate");
            return (Criteria) this;
        }

        public Criteria andCcontentIsNull() {
            addCriterion("ccontent is null");
            return (Criteria) this;
        }

        public Criteria andCcontentIsNotNull() {
            addCriterion("ccontent is not null");
            return (Criteria) this;
        }

        public Criteria andCcontentEqualTo(String value) {
            addCriterion("ccontent =", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotEqualTo(String value) {
            addCriterion("ccontent <>", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentGreaterThan(String value) {
            addCriterion("ccontent >", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentGreaterThanOrEqualTo(String value) {
            addCriterion("ccontent >=", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLessThan(String value) {
            addCriterion("ccontent <", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLessThanOrEqualTo(String value) {
            addCriterion("ccontent <=", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLike(String value) {
            addCriterion("ccontent like", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotLike(String value) {
            addCriterion("ccontent not like", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentIn(List<String> values) {
            addCriterion("ccontent in", values, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotIn(List<String> values) {
            addCriterion("ccontent not in", values, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentBetween(String value1, String value2) {
            addCriterion("ccontent between", value1, value2, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotBetween(String value1, String value2) {
            addCriterion("ccontent not between", value1, value2, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCuidIsNull() {
            addCriterion("cuid is null");
            return (Criteria) this;
        }

        public Criteria andCuidIsNotNull() {
            addCriterion("cuid is not null");
            return (Criteria) this;
        }

        public Criteria andCuidEqualTo(Integer value) {
            addCriterion("cuid =", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotEqualTo(Integer value) {
            addCriterion("cuid <>", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThan(Integer value) {
            addCriterion("cuid >", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cuid >=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThan(Integer value) {
            addCriterion("cuid <", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThanOrEqualTo(Integer value) {
            addCriterion("cuid <=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidIn(List<Integer> values) {
            addCriterion("cuid in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotIn(List<Integer> values) {
            addCriterion("cuid not in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidBetween(Integer value1, Integer value2) {
            addCriterion("cuid between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotBetween(Integer value1, Integer value2) {
            addCriterion("cuid not between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCaidIsNull() {
            addCriterion("caid is null");
            return (Criteria) this;
        }

        public Criteria andCaidIsNotNull() {
            addCriterion("caid is not null");
            return (Criteria) this;
        }

        public Criteria andCaidEqualTo(Integer value) {
            addCriterion("caid =", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidNotEqualTo(Integer value) {
            addCriterion("caid <>", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidGreaterThan(Integer value) {
            addCriterion("caid >", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("caid >=", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidLessThan(Integer value) {
            addCriterion("caid <", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidLessThanOrEqualTo(Integer value) {
            addCriterion("caid <=", value, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidIn(List<Integer> values) {
            addCriterion("caid in", values, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidNotIn(List<Integer> values) {
            addCriterion("caid not in", values, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidBetween(Integer value1, Integer value2) {
            addCriterion("caid between", value1, value2, "caid");
            return (Criteria) this;
        }

        public Criteria andCaidNotBetween(Integer value1, Integer value2) {
            addCriterion("caid not between", value1, value2, "caid");
            return (Criteria) this;
        }

        public Criteria andCcountsIsNull() {
            addCriterion("ccounts is null");
            return (Criteria) this;
        }

        public Criteria andCcountsIsNotNull() {
            addCriterion("ccounts is not null");
            return (Criteria) this;
        }

        public Criteria andCcountsEqualTo(Integer value) {
            addCriterion("ccounts =", value, "ccounts");
            return (Criteria) this;
        }

        public Criteria andCcountsNotEqualTo(Integer value) {
            addCriterion("ccounts <>", value, "ccounts");
            return (Criteria) this;
        }

        public Criteria andCcountsGreaterThan(Integer value) {
            addCriterion("ccounts >", value, "ccounts");
            return (Criteria) this;
        }

        public Criteria andCcountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ccounts >=", value, "ccounts");
            return (Criteria) this;
        }

        public Criteria andCcountsLessThan(Integer value) {
            addCriterion("ccounts <", value, "ccounts");
            return (Criteria) this;
        }

        public Criteria andCcountsLessThanOrEqualTo(Integer value) {
            addCriterion("ccounts <=", value, "ccounts");
            return (Criteria) this;
        }

        public Criteria andCcountsIn(List<Integer> values) {
            addCriterion("ccounts in", values, "ccounts");
            return (Criteria) this;
        }

        public Criteria andCcountsNotIn(List<Integer> values) {
            addCriterion("ccounts not in", values, "ccounts");
            return (Criteria) this;
        }

        public Criteria andCcountsBetween(Integer value1, Integer value2) {
            addCriterion("ccounts between", value1, value2, "ccounts");
            return (Criteria) this;
        }

        public Criteria andCcountsNotBetween(Integer value1, Integer value2) {
            addCriterion("ccounts not between", value1, value2, "ccounts");
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