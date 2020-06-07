package com.offcn.rljk.bean;

import java.util.ArrayList;
import java.util.List;

public class ShujvcaijiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShujvcaijiExample() {
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

        public Criteria andWenduIsNull() {
            addCriterion("wendu is null");
            return (Criteria) this;
        }

        public Criteria andWenduIsNotNull() {
            addCriterion("wendu is not null");
            return (Criteria) this;
        }

        public Criteria andWenduEqualTo(String value) {
            addCriterion("wendu =", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduNotEqualTo(String value) {
            addCriterion("wendu <>", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduGreaterThan(String value) {
            addCriterion("wendu >", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduGreaterThanOrEqualTo(String value) {
            addCriterion("wendu >=", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduLessThan(String value) {
            addCriterion("wendu <", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduLessThanOrEqualTo(String value) {
            addCriterion("wendu <=", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduLike(String value) {
            addCriterion("wendu like", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduNotLike(String value) {
            addCriterion("wendu not like", value, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduIn(List<String> values) {
            addCriterion("wendu in", values, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduNotIn(List<String> values) {
            addCriterion("wendu not in", values, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduBetween(String value1, String value2) {
            addCriterion("wendu between", value1, value2, "wendu");
            return (Criteria) this;
        }

        public Criteria andWenduNotBetween(String value1, String value2) {
            addCriterion("wendu not between", value1, value2, "wendu");
            return (Criteria) this;
        }

        public Criteria andYaliIsNull() {
            addCriterion("yali is null");
            return (Criteria) this;
        }

        public Criteria andYaliIsNotNull() {
            addCriterion("yali is not null");
            return (Criteria) this;
        }

        public Criteria andYaliEqualTo(String value) {
            addCriterion("yali =", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliNotEqualTo(String value) {
            addCriterion("yali <>", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliGreaterThan(String value) {
            addCriterion("yali >", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliGreaterThanOrEqualTo(String value) {
            addCriterion("yali >=", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliLessThan(String value) {
            addCriterion("yali <", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliLessThanOrEqualTo(String value) {
            addCriterion("yali <=", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliLike(String value) {
            addCriterion("yali like", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliNotLike(String value) {
            addCriterion("yali not like", value, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliIn(List<String> values) {
            addCriterion("yali in", values, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliNotIn(List<String> values) {
            addCriterion("yali not in", values, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliBetween(String value1, String value2) {
            addCriterion("yali between", value1, value2, "yali");
            return (Criteria) this;
        }

        public Criteria andYaliNotBetween(String value1, String value2) {
            addCriterion("yali not between", value1, value2, "yali");
            return (Criteria) this;
        }

        public Criteria andReliangIsNull() {
            addCriterion("reliang is null");
            return (Criteria) this;
        }

        public Criteria andReliangIsNotNull() {
            addCriterion("reliang is not null");
            return (Criteria) this;
        }

        public Criteria andReliangEqualTo(String value) {
            addCriterion("reliang =", value, "reliang");
            return (Criteria) this;
        }

        public Criteria andReliangNotEqualTo(String value) {
            addCriterion("reliang <>", value, "reliang");
            return (Criteria) this;
        }

        public Criteria andReliangGreaterThan(String value) {
            addCriterion("reliang >", value, "reliang");
            return (Criteria) this;
        }

        public Criteria andReliangGreaterThanOrEqualTo(String value) {
            addCriterion("reliang >=", value, "reliang");
            return (Criteria) this;
        }

        public Criteria andReliangLessThan(String value) {
            addCriterion("reliang <", value, "reliang");
            return (Criteria) this;
        }

        public Criteria andReliangLessThanOrEqualTo(String value) {
            addCriterion("reliang <=", value, "reliang");
            return (Criteria) this;
        }

        public Criteria andReliangLike(String value) {
            addCriterion("reliang like", value, "reliang");
            return (Criteria) this;
        }

        public Criteria andReliangNotLike(String value) {
            addCriterion("reliang not like", value, "reliang");
            return (Criteria) this;
        }

        public Criteria andReliangIn(List<String> values) {
            addCriterion("reliang in", values, "reliang");
            return (Criteria) this;
        }

        public Criteria andReliangNotIn(List<String> values) {
            addCriterion("reliang not in", values, "reliang");
            return (Criteria) this;
        }

        public Criteria andReliangBetween(String value1, String value2) {
            addCriterion("reliang between", value1, value2, "reliang");
            return (Criteria) this;
        }

        public Criteria andReliangNotBetween(String value1, String value2) {
            addCriterion("reliang not between", value1, value2, "reliang");
            return (Criteria) this;
        }

        public Criteria andFakongIsNull() {
            addCriterion("fakong is null");
            return (Criteria) this;
        }

        public Criteria andFakongIsNotNull() {
            addCriterion("fakong is not null");
            return (Criteria) this;
        }

        public Criteria andFakongEqualTo(String value) {
            addCriterion("fakong =", value, "fakong");
            return (Criteria) this;
        }

        public Criteria andFakongNotEqualTo(String value) {
            addCriterion("fakong <>", value, "fakong");
            return (Criteria) this;
        }

        public Criteria andFakongGreaterThan(String value) {
            addCriterion("fakong >", value, "fakong");
            return (Criteria) this;
        }

        public Criteria andFakongGreaterThanOrEqualTo(String value) {
            addCriterion("fakong >=", value, "fakong");
            return (Criteria) this;
        }

        public Criteria andFakongLessThan(String value) {
            addCriterion("fakong <", value, "fakong");
            return (Criteria) this;
        }

        public Criteria andFakongLessThanOrEqualTo(String value) {
            addCriterion("fakong <=", value, "fakong");
            return (Criteria) this;
        }

        public Criteria andFakongLike(String value) {
            addCriterion("fakong like", value, "fakong");
            return (Criteria) this;
        }

        public Criteria andFakongNotLike(String value) {
            addCriterion("fakong not like", value, "fakong");
            return (Criteria) this;
        }

        public Criteria andFakongIn(List<String> values) {
            addCriterion("fakong in", values, "fakong");
            return (Criteria) this;
        }

        public Criteria andFakongNotIn(List<String> values) {
            addCriterion("fakong not in", values, "fakong");
            return (Criteria) this;
        }

        public Criteria andFakongBetween(String value1, String value2) {
            addCriterion("fakong between", value1, value2, "fakong");
            return (Criteria) this;
        }

        public Criteria andFakongNotBetween(String value1, String value2) {
            addCriterion("fakong not between", value1, value2, "fakong");
            return (Criteria) this;
        }

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
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