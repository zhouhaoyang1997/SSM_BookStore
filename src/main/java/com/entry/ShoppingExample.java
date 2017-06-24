package com.entry;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ShoppingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingExample() {
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

        public Criteria andShoppingIdIsNull() {
            addCriterion("shopping_id is null");
            return (Criteria) this;
        }

        public Criteria andShoppingIdIsNotNull() {
            addCriterion("shopping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingIdEqualTo(Integer value) {
            addCriterion("shopping_id =", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdNotEqualTo(Integer value) {
            addCriterion("shopping_id <>", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdGreaterThan(Integer value) {
            addCriterion("shopping_id >", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_id >=", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdLessThan(Integer value) {
            addCriterion("shopping_id <", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_id <=", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdIn(List<Integer> values) {
            addCriterion("shopping_id in", values, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdNotIn(List<Integer> values) {
            addCriterion("shopping_id not in", values, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdBetween(Integer value1, Integer value2) {
            addCriterion("shopping_id between", value1, value2, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_id not between", value1, value2, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsIsNull() {
            addCriterion("shopping_goods is null");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsIsNotNull() {
            addCriterion("shopping_goods is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsEqualTo(Integer value) {
            addCriterion("shopping_goods =", value, "shoppingGoods");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsNotEqualTo(Integer value) {
            addCriterion("shopping_goods <>", value, "shoppingGoods");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsGreaterThan(Integer value) {
            addCriterion("shopping_goods >", value, "shoppingGoods");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_goods >=", value, "shoppingGoods");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsLessThan(Integer value) {
            addCriterion("shopping_goods <", value, "shoppingGoods");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_goods <=", value, "shoppingGoods");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsIn(List<Integer> values) {
            addCriterion("shopping_goods in", values, "shoppingGoods");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsNotIn(List<Integer> values) {
            addCriterion("shopping_goods not in", values, "shoppingGoods");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsBetween(Integer value1, Integer value2) {
            addCriterion("shopping_goods between", value1, value2, "shoppingGoods");
            return (Criteria) this;
        }

        public Criteria andShoppingGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_goods not between", value1, value2, "shoppingGoods");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIsNull() {
            addCriterion("shopping_price is null");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIsNotNull() {
            addCriterion("shopping_price is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceEqualTo(Integer value) {
            addCriterion("shopping_price =", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotEqualTo(Integer value) {
            addCriterion("shopping_price <>", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceGreaterThan(Integer value) {
            addCriterion("shopping_price >", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_price >=", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceLessThan(Integer value) {
            addCriterion("shopping_price <", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_price <=", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIn(List<Integer> values) {
            addCriterion("shopping_price in", values, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotIn(List<Integer> values) {
            addCriterion("shopping_price not in", values, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceBetween(Integer value1, Integer value2) {
            addCriterion("shopping_price between", value1, value2, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_price not between", value1, value2, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingNumIsNull() {
            addCriterion("shopping_num is null");
            return (Criteria) this;
        }

        public Criteria andShoppingNumIsNotNull() {
            addCriterion("shopping_num is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingNumEqualTo(Integer value) {
            addCriterion("shopping_num =", value, "shoppingNum");
            return (Criteria) this;
        }

        public Criteria andShoppingNumNotEqualTo(Integer value) {
            addCriterion("shopping_num <>", value, "shoppingNum");
            return (Criteria) this;
        }

        public Criteria andShoppingNumGreaterThan(Integer value) {
            addCriterion("shopping_num >", value, "shoppingNum");
            return (Criteria) this;
        }

        public Criteria andShoppingNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_num >=", value, "shoppingNum");
            return (Criteria) this;
        }

        public Criteria andShoppingNumLessThan(Integer value) {
            addCriterion("shopping_num <", value, "shoppingNum");
            return (Criteria) this;
        }

        public Criteria andShoppingNumLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_num <=", value, "shoppingNum");
            return (Criteria) this;
        }

        public Criteria andShoppingNumIn(List<Integer> values) {
            addCriterion("shopping_num in", values, "shoppingNum");
            return (Criteria) this;
        }

        public Criteria andShoppingNumNotIn(List<Integer> values) {
            addCriterion("shopping_num not in", values, "shoppingNum");
            return (Criteria) this;
        }

        public Criteria andShoppingNumBetween(Integer value1, Integer value2) {
            addCriterion("shopping_num between", value1, value2, "shoppingNum");
            return (Criteria) this;
        }

        public Criteria andShoppingNumNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_num not between", value1, value2, "shoppingNum");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidIsNull() {
            addCriterion("shopping_usersid is null");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidIsNotNull() {
            addCriterion("shopping_usersid is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidEqualTo(Integer value) {
            addCriterion("shopping_usersid =", value, "shoppingUsersid");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidNotEqualTo(Integer value) {
            addCriterion("shopping_usersid <>", value, "shoppingUsersid");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidGreaterThan(Integer value) {
            addCriterion("shopping_usersid >", value, "shoppingUsersid");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopping_usersid >=", value, "shoppingUsersid");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidLessThan(Integer value) {
            addCriterion("shopping_usersid <", value, "shoppingUsersid");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidLessThanOrEqualTo(Integer value) {
            addCriterion("shopping_usersid <=", value, "shoppingUsersid");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidIn(List<Integer> values) {
            addCriterion("shopping_usersid in", values, "shoppingUsersid");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidNotIn(List<Integer> values) {
            addCriterion("shopping_usersid not in", values, "shoppingUsersid");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidBetween(Integer value1, Integer value2) {
            addCriterion("shopping_usersid between", value1, value2, "shoppingUsersid");
            return (Criteria) this;
        }

        public Criteria andShoppingUsersidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopping_usersid not between", value1, value2, "shoppingUsersid");
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