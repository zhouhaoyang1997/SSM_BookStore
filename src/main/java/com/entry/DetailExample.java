package com.entry;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class DetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailExample() {
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

        public Criteria andDetailsIdIsNull() {
            addCriterion("details_id is null");
            return (Criteria) this;
        }

        public Criteria andDetailsIdIsNotNull() {
            addCriterion("details_id is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsIdEqualTo(Integer value) {
            addCriterion("details_id =", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotEqualTo(Integer value) {
            addCriterion("details_id <>", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdGreaterThan(Integer value) {
            addCriterion("details_id >", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("details_id >=", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdLessThan(Integer value) {
            addCriterion("details_id <", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdLessThanOrEqualTo(Integer value) {
            addCriterion("details_id <=", value, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdIn(List<Integer> values) {
            addCriterion("details_id in", values, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotIn(List<Integer> values) {
            addCriterion("details_id not in", values, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdBetween(Integer value1, Integer value2) {
            addCriterion("details_id between", value1, value2, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("details_id not between", value1, value2, "detailsId");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderIsNull() {
            addCriterion("details_order is null");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderIsNotNull() {
            addCriterion("details_order is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderEqualTo(String value) {
            addCriterion("details_order =", value, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderNotEqualTo(String value) {
            addCriterion("details_order <>", value, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderGreaterThan(String value) {
            addCriterion("details_order >", value, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderGreaterThanOrEqualTo(String value) {
            addCriterion("details_order >=", value, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderLessThan(String value) {
            addCriterion("details_order <", value, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderLessThanOrEqualTo(String value) {
            addCriterion("details_order <=", value, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderLike(String value) {
            addCriterion("details_order like", value, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderNotLike(String value) {
            addCriterion("details_order not like", value, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderIn(List<String> values) {
            addCriterion("details_order in", values, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderNotIn(List<String> values) {
            addCriterion("details_order not in", values, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderBetween(String value1, String value2) {
            addCriterion("details_order between", value1, value2, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsOrderNotBetween(String value1, String value2) {
            addCriterion("details_order not between", value1, value2, "detailsOrder");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsIsNull() {
            addCriterion("details_goods is null");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsIsNotNull() {
            addCriterion("details_goods is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsEqualTo(Integer value) {
            addCriterion("details_goods =", value, "detailsGoods");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsNotEqualTo(Integer value) {
            addCriterion("details_goods <>", value, "detailsGoods");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsGreaterThan(Integer value) {
            addCriterion("details_goods >", value, "detailsGoods");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("details_goods >=", value, "detailsGoods");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsLessThan(Integer value) {
            addCriterion("details_goods <", value, "detailsGoods");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("details_goods <=", value, "detailsGoods");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsIn(List<Integer> values) {
            addCriterion("details_goods in", values, "detailsGoods");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsNotIn(List<Integer> values) {
            addCriterion("details_goods not in", values, "detailsGoods");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsBetween(Integer value1, Integer value2) {
            addCriterion("details_goods between", value1, value2, "detailsGoods");
            return (Criteria) this;
        }

        public Criteria andDetailsGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("details_goods not between", value1, value2, "detailsGoods");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceIsNull() {
            addCriterion("details_price is null");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceIsNotNull() {
            addCriterion("details_price is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceEqualTo(Integer value) {
            addCriterion("details_price =", value, "detailsPrice");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceNotEqualTo(Integer value) {
            addCriterion("details_price <>", value, "detailsPrice");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceGreaterThan(Integer value) {
            addCriterion("details_price >", value, "detailsPrice");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("details_price >=", value, "detailsPrice");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceLessThan(Integer value) {
            addCriterion("details_price <", value, "detailsPrice");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceLessThanOrEqualTo(Integer value) {
            addCriterion("details_price <=", value, "detailsPrice");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceIn(List<Integer> values) {
            addCriterion("details_price in", values, "detailsPrice");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceNotIn(List<Integer> values) {
            addCriterion("details_price not in", values, "detailsPrice");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceBetween(Integer value1, Integer value2) {
            addCriterion("details_price between", value1, value2, "detailsPrice");
            return (Criteria) this;
        }

        public Criteria andDetailsPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("details_price not between", value1, value2, "detailsPrice");
            return (Criteria) this;
        }

        public Criteria andDetailsNumIsNull() {
            addCriterion("details_num is null");
            return (Criteria) this;
        }

        public Criteria andDetailsNumIsNotNull() {
            addCriterion("details_num is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsNumEqualTo(Integer value) {
            addCriterion("details_num =", value, "detailsNum");
            return (Criteria) this;
        }

        public Criteria andDetailsNumNotEqualTo(Integer value) {
            addCriterion("details_num <>", value, "detailsNum");
            return (Criteria) this;
        }

        public Criteria andDetailsNumGreaterThan(Integer value) {
            addCriterion("details_num >", value, "detailsNum");
            return (Criteria) this;
        }

        public Criteria andDetailsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("details_num >=", value, "detailsNum");
            return (Criteria) this;
        }

        public Criteria andDetailsNumLessThan(Integer value) {
            addCriterion("details_num <", value, "detailsNum");
            return (Criteria) this;
        }

        public Criteria andDetailsNumLessThanOrEqualTo(Integer value) {
            addCriterion("details_num <=", value, "detailsNum");
            return (Criteria) this;
        }

        public Criteria andDetailsNumIn(List<Integer> values) {
            addCriterion("details_num in", values, "detailsNum");
            return (Criteria) this;
        }

        public Criteria andDetailsNumNotIn(List<Integer> values) {
            addCriterion("details_num not in", values, "detailsNum");
            return (Criteria) this;
        }

        public Criteria andDetailsNumBetween(Integer value1, Integer value2) {
            addCriterion("details_num between", value1, value2, "detailsNum");
            return (Criteria) this;
        }

        public Criteria andDetailsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("details_num not between", value1, value2, "detailsNum");
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