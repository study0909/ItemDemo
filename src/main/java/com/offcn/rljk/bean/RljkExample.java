package com.offcn.rljk.bean;

import java.util.ArrayList;
import java.util.List;

public class RljkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RljkExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andZhanhaoIsNull() {
            addCriterion("zhanhao is null");
            return (Criteria) this;
        }

        public Criteria andZhanhaoIsNotNull() {
            addCriterion("zhanhao is not null");
            return (Criteria) this;
        }

        public Criteria andZhanhaoEqualTo(String value) {
            addCriterion("zhanhao =", value, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhanhaoNotEqualTo(String value) {
            addCriterion("zhanhao <>", value, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhanhaoGreaterThan(String value) {
            addCriterion("zhanhao >", value, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhanhaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhanhao >=", value, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhanhaoLessThan(String value) {
            addCriterion("zhanhao <", value, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhanhaoLessThanOrEqualTo(String value) {
            addCriterion("zhanhao <=", value, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhanhaoLike(String value) {
            addCriterion("zhanhao like", value, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhanhaoNotLike(String value) {
            addCriterion("zhanhao not like", value, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhanhaoIn(List<String> values) {
            addCriterion("zhanhao in", values, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhanhaoNotIn(List<String> values) {
            addCriterion("zhanhao not in", values, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhanhaoBetween(String value1, String value2) {
            addCriterion("zhanhao between", value1, value2, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhanhaoNotBetween(String value1, String value2) {
            addCriterion("zhanhao not between", value1, value2, "zhanhao");
            return (Criteria) this;
        }

        public Criteria andZhannameIsNull() {
            addCriterion("zhanname is null");
            return (Criteria) this;
        }

        public Criteria andZhannameIsNotNull() {
            addCriterion("zhanname is not null");
            return (Criteria) this;
        }

        public Criteria andZhannameEqualTo(String value) {
            addCriterion("zhanname =", value, "zhanname");
            return (Criteria) this;
        }

        public Criteria andZhannameNotEqualTo(String value) {
            addCriterion("zhanname <>", value, "zhanname");
            return (Criteria) this;
        }

        public Criteria andZhannameGreaterThan(String value) {
            addCriterion("zhanname >", value, "zhanname");
            return (Criteria) this;
        }

        public Criteria andZhannameGreaterThanOrEqualTo(String value) {
            addCriterion("zhanname >=", value, "zhanname");
            return (Criteria) this;
        }

        public Criteria andZhannameLessThan(String value) {
            addCriterion("zhanname <", value, "zhanname");
            return (Criteria) this;
        }

        public Criteria andZhannameLessThanOrEqualTo(String value) {
            addCriterion("zhanname <=", value, "zhanname");
            return (Criteria) this;
        }

        public Criteria andZhannameLike(String value) {
            addCriterion("zhanname like", value, "zhanname");
            return (Criteria) this;
        }

        public Criteria andZhannameNotLike(String value) {
            addCriterion("zhanname not like", value, "zhanname");
            return (Criteria) this;
        }

        public Criteria andZhannameIn(List<String> values) {
            addCriterion("zhanname in", values, "zhanname");
            return (Criteria) this;
        }

        public Criteria andZhannameNotIn(List<String> values) {
            addCriterion("zhanname not in", values, "zhanname");
            return (Criteria) this;
        }

        public Criteria andZhannameBetween(String value1, String value2) {
            addCriterion("zhanname between", value1, value2, "zhanname");
            return (Criteria) this;
        }

        public Criteria andZhannameNotBetween(String value1, String value2) {
            addCriterion("zhanname not between", value1, value2, "zhanname");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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