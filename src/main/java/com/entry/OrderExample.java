package com.entry;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrdersIdIsNull() {
            addCriterion("orders_id is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIsNotNull() {
            addCriterion("orders_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersIdEqualTo(String value) {
            addCriterion("orders_id =", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotEqualTo(String value) {
            addCriterion("orders_id <>", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThan(String value) {
            addCriterion("orders_id >", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdGreaterThanOrEqualTo(String value) {
            addCriterion("orders_id >=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThan(String value) {
            addCriterion("orders_id <", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLessThanOrEqualTo(String value) {
            addCriterion("orders_id <=", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdLike(String value) {
            addCriterion("orders_id like", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotLike(String value) {
            addCriterion("orders_id not like", value, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdIn(List<String> values) {
            addCriterion("orders_id in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotIn(List<String> values) {
            addCriterion("orders_id not in", values, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdBetween(String value1, String value2) {
            addCriterion("orders_id between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersIdNotBetween(String value1, String value2) {
            addCriterion("orders_id not between", value1, value2, "ordersId");
            return (Criteria) this;
        }

        public Criteria andOrdersUserIsNull() {
            addCriterion("orders_user is null");
            return (Criteria) this;
        }

        public Criteria andOrdersUserIsNotNull() {
            addCriterion("orders_user is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersUserEqualTo(Integer value) {
            addCriterion("orders_user =", value, "ordersUser");
            return (Criteria) this;
        }

        public Criteria andOrdersUserNotEqualTo(Integer value) {
            addCriterion("orders_user <>", value, "ordersUser");
            return (Criteria) this;
        }

        public Criteria andOrdersUserGreaterThan(Integer value) {
            addCriterion("orders_user >", value, "ordersUser");
            return (Criteria) this;
        }

        public Criteria andOrdersUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_user >=", value, "ordersUser");
            return (Criteria) this;
        }

        public Criteria andOrdersUserLessThan(Integer value) {
            addCriterion("orders_user <", value, "ordersUser");
            return (Criteria) this;
        }

        public Criteria andOrdersUserLessThanOrEqualTo(Integer value) {
            addCriterion("orders_user <=", value, "ordersUser");
            return (Criteria) this;
        }

        public Criteria andOrdersUserIn(List<Integer> values) {
            addCriterion("orders_user in", values, "ordersUser");
            return (Criteria) this;
        }

        public Criteria andOrdersUserNotIn(List<Integer> values) {
            addCriterion("orders_user not in", values, "ordersUser");
            return (Criteria) this;
        }

        public Criteria andOrdersUserBetween(Integer value1, Integer value2) {
            addCriterion("orders_user between", value1, value2, "ordersUser");
            return (Criteria) this;
        }

        public Criteria andOrdersUserNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_user not between", value1, value2, "ordersUser");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressIsNull() {
            addCriterion("orders_address is null");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressIsNotNull() {
            addCriterion("orders_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressEqualTo(String value) {
            addCriterion("orders_address =", value, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressNotEqualTo(String value) {
            addCriterion("orders_address <>", value, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressGreaterThan(String value) {
            addCriterion("orders_address >", value, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressGreaterThanOrEqualTo(String value) {
            addCriterion("orders_address >=", value, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressLessThan(String value) {
            addCriterion("orders_address <", value, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressLessThanOrEqualTo(String value) {
            addCriterion("orders_address <=", value, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressLike(String value) {
            addCriterion("orders_address like", value, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressNotLike(String value) {
            addCriterion("orders_address not like", value, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressIn(List<String> values) {
            addCriterion("orders_address in", values, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressNotIn(List<String> values) {
            addCriterion("orders_address not in", values, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressBetween(String value1, String value2) {
            addCriterion("orders_address between", value1, value2, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersAddressNotBetween(String value1, String value2) {
            addCriterion("orders_address not between", value1, value2, "ordersAddress");
            return (Criteria) this;
        }

        public Criteria andOrdersTelIsNull() {
            addCriterion("orders_tel is null");
            return (Criteria) this;
        }

        public Criteria andOrdersTelIsNotNull() {
            addCriterion("orders_tel is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersTelEqualTo(Integer value) {
            addCriterion("orders_tel =", value, "ordersTel");
            return (Criteria) this;
        }

        public Criteria andOrdersTelNotEqualTo(Integer value) {
            addCriterion("orders_tel <>", value, "ordersTel");
            return (Criteria) this;
        }

        public Criteria andOrdersTelGreaterThan(Integer value) {
            addCriterion("orders_tel >", value, "ordersTel");
            return (Criteria) this;
        }

        public Criteria andOrdersTelGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_tel >=", value, "ordersTel");
            return (Criteria) this;
        }

        public Criteria andOrdersTelLessThan(Integer value) {
            addCriterion("orders_tel <", value, "ordersTel");
            return (Criteria) this;
        }

        public Criteria andOrdersTelLessThanOrEqualTo(Integer value) {
            addCriterion("orders_tel <=", value, "ordersTel");
            return (Criteria) this;
        }

        public Criteria andOrdersTelIn(List<Integer> values) {
            addCriterion("orders_tel in", values, "ordersTel");
            return (Criteria) this;
        }

        public Criteria andOrdersTelNotIn(List<Integer> values) {
            addCriterion("orders_tel not in", values, "ordersTel");
            return (Criteria) this;
        }

        public Criteria andOrdersTelBetween(Integer value1, Integer value2) {
            addCriterion("orders_tel between", value1, value2, "ordersTel");
            return (Criteria) this;
        }

        public Criteria andOrdersTelNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_tel not between", value1, value2, "ordersTel");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusIsNull() {
            addCriterion("orders_status is null");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusIsNotNull() {
            addCriterion("orders_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusEqualTo(String value) {
            addCriterion("orders_status =", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusNotEqualTo(String value) {
            addCriterion("orders_status <>", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusGreaterThan(String value) {
            addCriterion("orders_status >", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusGreaterThanOrEqualTo(String value) {
            addCriterion("orders_status >=", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusLessThan(String value) {
            addCriterion("orders_status <", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusLessThanOrEqualTo(String value) {
            addCriterion("orders_status <=", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusLike(String value) {
            addCriterion("orders_status like", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusNotLike(String value) {
            addCriterion("orders_status not like", value, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusIn(List<String> values) {
            addCriterion("orders_status in", values, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusNotIn(List<String> values) {
            addCriterion("orders_status not in", values, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusBetween(String value1, String value2) {
            addCriterion("orders_status between", value1, value2, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersStatusNotBetween(String value1, String value2) {
            addCriterion("orders_status not between", value1, value2, "ordersStatus");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeIsNull() {
            addCriterion("orders_consignee is null");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeIsNotNull() {
            addCriterion("orders_consignee is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeEqualTo(String value) {
            addCriterion("orders_consignee =", value, "ordersConsignee");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeNotEqualTo(String value) {
            addCriterion("orders_consignee <>", value, "ordersConsignee");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeGreaterThan(String value) {
            addCriterion("orders_consignee >", value, "ordersConsignee");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("orders_consignee >=", value, "ordersConsignee");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeLessThan(String value) {
            addCriterion("orders_consignee <", value, "ordersConsignee");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeLessThanOrEqualTo(String value) {
            addCriterion("orders_consignee <=", value, "ordersConsignee");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeLike(String value) {
            addCriterion("orders_consignee like", value, "ordersConsignee");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeNotLike(String value) {
            addCriterion("orders_consignee not like", value, "ordersConsignee");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeIn(List<String> values) {
            addCriterion("orders_consignee in", values, "ordersConsignee");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeNotIn(List<String> values) {
            addCriterion("orders_consignee not in", values, "ordersConsignee");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeBetween(String value1, String value2) {
            addCriterion("orders_consignee between", value1, value2, "ordersConsignee");
            return (Criteria) this;
        }

        public Criteria andOrdersConsigneeNotBetween(String value1, String value2) {
            addCriterion("orders_consignee not between", value1, value2, "ordersConsignee");
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