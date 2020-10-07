package com.kgc.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetsExample() {
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

        public Criteria andAssetidIsNull() {
            addCriterion("assetid is null");
            return (Criteria) this;
        }

        public Criteria andAssetidIsNotNull() {
            addCriterion("assetid is not null");
            return (Criteria) this;
        }

        public Criteria andAssetidEqualTo(String value) {
            addCriterion("assetid =", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotEqualTo(String value) {
            addCriterion("assetid <>", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidGreaterThan(String value) {
            addCriterion("assetid >", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidGreaterThanOrEqualTo(String value) {
            addCriterion("assetid >=", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidLessThan(String value) {
            addCriterion("assetid <", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidLessThanOrEqualTo(String value) {
            addCriterion("assetid <=", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidLike(String value) {
            addCriterion("assetid like", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotLike(String value) {
            addCriterion("assetid not like", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidIn(List<String> values) {
            addCriterion("assetid in", values, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotIn(List<String> values) {
            addCriterion("assetid not in", values, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidBetween(String value1, String value2) {
            addCriterion("assetid between", value1, value2, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotBetween(String value1, String value2) {
            addCriterion("assetid not between", value1, value2, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetnameIsNull() {
            addCriterion("assetname is null");
            return (Criteria) this;
        }

        public Criteria andAssetnameIsNotNull() {
            addCriterion("assetname is not null");
            return (Criteria) this;
        }

        public Criteria andAssetnameEqualTo(String value) {
            addCriterion("assetname =", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotEqualTo(String value) {
            addCriterion("assetname <>", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameGreaterThan(String value) {
            addCriterion("assetname >", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameGreaterThanOrEqualTo(String value) {
            addCriterion("assetname >=", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLessThan(String value) {
            addCriterion("assetname <", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLessThanOrEqualTo(String value) {
            addCriterion("assetname <=", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameLike(String value) {
            addCriterion("assetname like", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotLike(String value) {
            addCriterion("assetname not like", value, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameIn(List<String> values) {
            addCriterion("assetname in", values, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotIn(List<String> values) {
            addCriterion("assetname not in", values, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameBetween(String value1, String value2) {
            addCriterion("assetname between", value1, value2, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssetnameNotBetween(String value1, String value2) {
            addCriterion("assetname not between", value1, value2, "assetname");
            return (Criteria) this;
        }

        public Criteria andAssettypeIsNull() {
            addCriterion("assettype is null");
            return (Criteria) this;
        }

        public Criteria andAssettypeIsNotNull() {
            addCriterion("assettype is not null");
            return (Criteria) this;
        }

        public Criteria andAssettypeEqualTo(String value) {
            addCriterion("assettype =", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotEqualTo(String value) {
            addCriterion("assettype <>", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeGreaterThan(String value) {
            addCriterion("assettype >", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeGreaterThanOrEqualTo(String value) {
            addCriterion("assettype >=", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLessThan(String value) {
            addCriterion("assettype <", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLessThanOrEqualTo(String value) {
            addCriterion("assettype <=", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeLike(String value) {
            addCriterion("assettype like", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotLike(String value) {
            addCriterion("assettype not like", value, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeIn(List<String> values) {
            addCriterion("assettype in", values, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotIn(List<String> values) {
            addCriterion("assettype not in", values, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeBetween(String value1, String value2) {
            addCriterion("assettype between", value1, value2, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssettypeNotBetween(String value1, String value2) {
            addCriterion("assettype not between", value1, value2, "assettype");
            return (Criteria) this;
        }

        public Criteria andAssetdateIsNull() {
            addCriterion("assetdate is null");
            return (Criteria) this;
        }

        public Criteria andAssetdateIsNotNull() {
            addCriterion("assetdate is not null");
            return (Criteria) this;
        }

        public Criteria andAssetdateEqualTo(Date value) {
            addCriterion("assetdate =", value, "assetdate");
            return (Criteria) this;
        }

        public Criteria andAssetdateNotEqualTo(Date value) {
            addCriterion("assetdate <>", value, "assetdate");
            return (Criteria) this;
        }

        public Criteria andAssetdateGreaterThan(Date value) {
            addCriterion("assetdate >", value, "assetdate");
            return (Criteria) this;
        }

        public Criteria andAssetdateGreaterThanOrEqualTo(Date value) {
            addCriterion("assetdate >=", value, "assetdate");
            return (Criteria) this;
        }

        public Criteria andAssetdateLessThan(Date value) {
            addCriterion("assetdate <", value, "assetdate");
            return (Criteria) this;
        }

        public Criteria andAssetdateLessThanOrEqualTo(Date value) {
            addCriterion("assetdate <=", value, "assetdate");
            return (Criteria) this;
        }

        public Criteria andAssetdateIn(List<Date> values) {
            addCriterion("assetdate in", values, "assetdate");
            return (Criteria) this;
        }

        public Criteria andAssetdateNotIn(List<Date> values) {
            addCriterion("assetdate not in", values, "assetdate");
            return (Criteria) this;
        }

        public Criteria andAssetdateBetween(Date value1, Date value2) {
            addCriterion("assetdate between", value1, value2, "assetdate");
            return (Criteria) this;
        }

        public Criteria andAssetdateNotBetween(Date value1, Date value2) {
            addCriterion("assetdate not between", value1, value2, "assetdate");
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