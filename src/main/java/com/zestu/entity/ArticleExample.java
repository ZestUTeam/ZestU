package com.zestu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andAnoIsNull() {
            addCriterion("ano is null");
            return (Criteria) this;
        }

        public Criteria andAnoIsNotNull() {
            addCriterion("ano is not null");
            return (Criteria) this;
        }

        public Criteria andAnoEqualTo(Integer value) {
            addCriterion("ano =", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotEqualTo(Integer value) {
            addCriterion("ano <>", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThan(Integer value) {
            addCriterion("ano >", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ano >=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThan(Integer value) {
            addCriterion("ano <", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoLessThanOrEqualTo(Integer value) {
            addCriterion("ano <=", value, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoIn(List<Integer> values) {
            addCriterion("ano in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotIn(List<Integer> values) {
            addCriterion("ano not in", values, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoBetween(Integer value1, Integer value2) {
            addCriterion("ano between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andAnoNotBetween(Integer value1, Integer value2) {
            addCriterion("ano not between", value1, value2, "ano");
            return (Criteria) this;
        }

        public Criteria andAtitleIsNull() {
            addCriterion("atitle is null");
            return (Criteria) this;
        }

        public Criteria andAtitleIsNotNull() {
            addCriterion("atitle is not null");
            return (Criteria) this;
        }

        public Criteria andAtitleEqualTo(String value) {
            addCriterion("atitle =", value, "atitle");
            return (Criteria) this;
        }

        public Criteria andAtitleNotEqualTo(String value) {
            addCriterion("atitle <>", value, "atitle");
            return (Criteria) this;
        }

        public Criteria andAtitleGreaterThan(String value) {
            addCriterion("atitle >", value, "atitle");
            return (Criteria) this;
        }

        public Criteria andAtitleGreaterThanOrEqualTo(String value) {
            addCriterion("atitle >=", value, "atitle");
            return (Criteria) this;
        }

        public Criteria andAtitleLessThan(String value) {
            addCriterion("atitle <", value, "atitle");
            return (Criteria) this;
        }

        public Criteria andAtitleLessThanOrEqualTo(String value) {
            addCriterion("atitle <=", value, "atitle");
            return (Criteria) this;
        }

        public Criteria andAtitleLike(String value) {
            addCriterion("atitle like", value, "atitle");
            return (Criteria) this;
        }

        public Criteria andAtitleNotLike(String value) {
            addCriterion("atitle not like", value, "atitle");
            return (Criteria) this;
        }

        public Criteria andAtitleIn(List<String> values) {
            addCriterion("atitle in", values, "atitle");
            return (Criteria) this;
        }

        public Criteria andAtitleNotIn(List<String> values) {
            addCriterion("atitle not in", values, "atitle");
            return (Criteria) this;
        }

        public Criteria andAtitleBetween(String value1, String value2) {
            addCriterion("atitle between", value1, value2, "atitle");
            return (Criteria) this;
        }

        public Criteria andAtitleNotBetween(String value1, String value2) {
            addCriterion("atitle not between", value1, value2, "atitle");
            return (Criteria) this;
        }

        public Criteria andAcontentIsNull() {
            addCriterion("acontent is null");
            return (Criteria) this;
        }

        public Criteria andAcontentIsNotNull() {
            addCriterion("acontent is not null");
            return (Criteria) this;
        }

        public Criteria andAcontentEqualTo(String value) {
            addCriterion("acontent =", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentNotEqualTo(String value) {
            addCriterion("acontent <>", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentGreaterThan(String value) {
            addCriterion("acontent >", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentGreaterThanOrEqualTo(String value) {
            addCriterion("acontent >=", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentLessThan(String value) {
            addCriterion("acontent <", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentLessThanOrEqualTo(String value) {
            addCriterion("acontent <=", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentLike(String value) {
            addCriterion("acontent like", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentNotLike(String value) {
            addCriterion("acontent not like", value, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentIn(List<String> values) {
            addCriterion("acontent in", values, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentNotIn(List<String> values) {
            addCriterion("acontent not in", values, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentBetween(String value1, String value2) {
            addCriterion("acontent between", value1, value2, "acontent");
            return (Criteria) this;
        }

        public Criteria andAcontentNotBetween(String value1, String value2) {
            addCriterion("acontent not between", value1, value2, "acontent");
            return (Criteria) this;
        }

        public Criteria andAdateIsNull() {
            addCriterion("adate is null");
            return (Criteria) this;
        }

        public Criteria andAdateIsNotNull() {
            addCriterion("adate is not null");
            return (Criteria) this;
        }

        public Criteria andAdateEqualTo(Date value) {
            addCriterion("adate =", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotEqualTo(Date value) {
            addCriterion("adate <>", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThan(Date value) {
            addCriterion("adate >", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThanOrEqualTo(Date value) {
            addCriterion("adate >=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThan(Date value) {
            addCriterion("adate <", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThanOrEqualTo(Date value) {
            addCriterion("adate <=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateIn(List<Date> values) {
            addCriterion("adate in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotIn(List<Date> values) {
            addCriterion("adate not in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateBetween(Date value1, Date value2) {
            addCriterion("adate between", value1, value2, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotBetween(Date value1, Date value2) {
            addCriterion("adate not between", value1, value2, "adate");
            return (Criteria) this;
        }

        public Criteria andAimgIsNull() {
            addCriterion("aimg is null");
            return (Criteria) this;
        }

        public Criteria andAimgIsNotNull() {
            addCriterion("aimg is not null");
            return (Criteria) this;
        }

        public Criteria andAimgEqualTo(String value) {
            addCriterion("aimg =", value, "aimg");
            return (Criteria) this;
        }

        public Criteria andAimgNotEqualTo(String value) {
            addCriterion("aimg <>", value, "aimg");
            return (Criteria) this;
        }

        public Criteria andAimgGreaterThan(String value) {
            addCriterion("aimg >", value, "aimg");
            return (Criteria) this;
        }

        public Criteria andAimgGreaterThanOrEqualTo(String value) {
            addCriterion("aimg >=", value, "aimg");
            return (Criteria) this;
        }

        public Criteria andAimgLessThan(String value) {
            addCriterion("aimg <", value, "aimg");
            return (Criteria) this;
        }

        public Criteria andAimgLessThanOrEqualTo(String value) {
            addCriterion("aimg <=", value, "aimg");
            return (Criteria) this;
        }

        public Criteria andAimgLike(String value) {
            addCriterion("aimg like", value, "aimg");
            return (Criteria) this;
        }

        public Criteria andAimgNotLike(String value) {
            addCriterion("aimg not like", value, "aimg");
            return (Criteria) this;
        }

        public Criteria andAimgIn(List<String> values) {
            addCriterion("aimg in", values, "aimg");
            return (Criteria) this;
        }

        public Criteria andAimgNotIn(List<String> values) {
            addCriterion("aimg not in", values, "aimg");
            return (Criteria) this;
        }

        public Criteria andAimgBetween(String value1, String value2) {
            addCriterion("aimg between", value1, value2, "aimg");
            return (Criteria) this;
        }

        public Criteria andAimgNotBetween(String value1, String value2) {
            addCriterion("aimg not between", value1, value2, "aimg");
            return (Criteria) this;
        }

        public Criteria andAunoIsNull() {
            addCriterion("auno is null");
            return (Criteria) this;
        }

        public Criteria andAunoIsNotNull() {
            addCriterion("auno is not null");
            return (Criteria) this;
        }

        public Criteria andAunoEqualTo(Integer value) {
            addCriterion("auno =", value, "auno");
            return (Criteria) this;
        }

        public Criteria andAunoNotEqualTo(Integer value) {
            addCriterion("auno <>", value, "auno");
            return (Criteria) this;
        }

        public Criteria andAunoGreaterThan(Integer value) {
            addCriterion("auno >", value, "auno");
            return (Criteria) this;
        }

        public Criteria andAunoGreaterThanOrEqualTo(Integer value) {
            addCriterion("auno >=", value, "auno");
            return (Criteria) this;
        }

        public Criteria andAunoLessThan(Integer value) {
            addCriterion("auno <", value, "auno");
            return (Criteria) this;
        }

        public Criteria andAunoLessThanOrEqualTo(Integer value) {
            addCriterion("auno <=", value, "auno");
            return (Criteria) this;
        }

        public Criteria andAunoIn(List<Integer> values) {
            addCriterion("auno in", values, "auno");
            return (Criteria) this;
        }

        public Criteria andAunoNotIn(List<Integer> values) {
            addCriterion("auno not in", values, "auno");
            return (Criteria) this;
        }

        public Criteria andAunoBetween(Integer value1, Integer value2) {
            addCriterion("auno between", value1, value2, "auno");
            return (Criteria) this;
        }

        public Criteria andAunoNotBetween(Integer value1, Integer value2) {
            addCriterion("auno not between", value1, value2, "auno");
            return (Criteria) this;
        }

        public Criteria andAknoIsNull() {
            addCriterion("akno is null");
            return (Criteria) this;
        }

        public Criteria andAknoIsNotNull() {
            addCriterion("akno is not null");
            return (Criteria) this;
        }

        public Criteria andAknoEqualTo(Integer value) {
            addCriterion("akno =", value, "akno");
            return (Criteria) this;
        }

        public Criteria andAknoNotEqualTo(Integer value) {
            addCriterion("akno <>", value, "akno");
            return (Criteria) this;
        }

        public Criteria andAknoGreaterThan(Integer value) {
            addCriterion("akno >", value, "akno");
            return (Criteria) this;
        }

        public Criteria andAknoGreaterThanOrEqualTo(Integer value) {
            addCriterion("akno >=", value, "akno");
            return (Criteria) this;
        }

        public Criteria andAknoLessThan(Integer value) {
            addCriterion("akno <", value, "akno");
            return (Criteria) this;
        }

        public Criteria andAknoLessThanOrEqualTo(Integer value) {
            addCriterion("akno <=", value, "akno");
            return (Criteria) this;
        }

        public Criteria andAknoIn(List<Integer> values) {
            addCriterion("akno in", values, "akno");
            return (Criteria) this;
        }

        public Criteria andAknoNotIn(List<Integer> values) {
            addCriterion("akno not in", values, "akno");
            return (Criteria) this;
        }

        public Criteria andAknoBetween(Integer value1, Integer value2) {
            addCriterion("akno between", value1, value2, "akno");
            return (Criteria) this;
        }

        public Criteria andAknoNotBetween(Integer value1, Integer value2) {
            addCriterion("akno not between", value1, value2, "akno");
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