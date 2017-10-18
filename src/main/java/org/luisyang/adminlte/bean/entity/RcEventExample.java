package org.luisyang.adminlte.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RcEventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int pageSize = -1;

    public RcEventExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setPageSize(int pageSize) {
        this.pageSize=pageSize;
    }

    public int getPageSize() {
        return pageSize;
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andAlldayIsNull() {
            addCriterion("allDay is null");
            return (Criteria) this;
        }

        public Criteria andAlldayIsNotNull() {
            addCriterion("allDay is not null");
            return (Criteria) this;
        }

        public Criteria andAlldayEqualTo(String value) {
            addCriterion("allDay =", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayNotEqualTo(String value) {
            addCriterion("allDay <>", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayGreaterThan(String value) {
            addCriterion("allDay >", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayGreaterThanOrEqualTo(String value) {
            addCriterion("allDay >=", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayLessThan(String value) {
            addCriterion("allDay <", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayLessThanOrEqualTo(String value) {
            addCriterion("allDay <=", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayLike(String value) {
            addCriterion("allDay like", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayNotLike(String value) {
            addCriterion("allDay not like", value, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayIn(List<String> values) {
            addCriterion("allDay in", values, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayNotIn(List<String> values) {
            addCriterion("allDay not in", values, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayBetween(String value1, String value2) {
            addCriterion("allDay between", value1, value2, "allday");
            return (Criteria) this;
        }

        public Criteria andAlldayNotBetween(String value1, String value2) {
            addCriterion("allDay not between", value1, value2, "allday");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorIsNull() {
            addCriterion("backgroundColor is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorIsNotNull() {
            addCriterion("backgroundColor is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorEqualTo(String value) {
            addCriterion("backgroundColor =", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotEqualTo(String value) {
            addCriterion("backgroundColor <>", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorGreaterThan(String value) {
            addCriterion("backgroundColor >", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorGreaterThanOrEqualTo(String value) {
            addCriterion("backgroundColor >=", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorLessThan(String value) {
            addCriterion("backgroundColor <", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorLessThanOrEqualTo(String value) {
            addCriterion("backgroundColor <=", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorLike(String value) {
            addCriterion("backgroundColor like", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotLike(String value) {
            addCriterion("backgroundColor not like", value, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorIn(List<String> values) {
            addCriterion("backgroundColor in", values, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotIn(List<String> values) {
            addCriterion("backgroundColor not in", values, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorBetween(String value1, String value2) {
            addCriterion("backgroundColor between", value1, value2, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBackgroundcolorNotBetween(String value1, String value2) {
            addCriterion("backgroundColor not between", value1, value2, "backgroundcolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorIsNull() {
            addCriterion("borderColor is null");
            return (Criteria) this;
        }

        public Criteria andBordercolorIsNotNull() {
            addCriterion("borderColor is not null");
            return (Criteria) this;
        }

        public Criteria andBordercolorEqualTo(String value) {
            addCriterion("borderColor =", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorNotEqualTo(String value) {
            addCriterion("borderColor <>", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorGreaterThan(String value) {
            addCriterion("borderColor >", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorGreaterThanOrEqualTo(String value) {
            addCriterion("borderColor >=", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorLessThan(String value) {
            addCriterion("borderColor <", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorLessThanOrEqualTo(String value) {
            addCriterion("borderColor <=", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorLike(String value) {
            addCriterion("borderColor like", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorNotLike(String value) {
            addCriterion("borderColor not like", value, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorIn(List<String> values) {
            addCriterion("borderColor in", values, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorNotIn(List<String> values) {
            addCriterion("borderColor not in", values, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorBetween(String value1, String value2) {
            addCriterion("borderColor between", value1, value2, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andBordercolorNotBetween(String value1, String value2) {
            addCriterion("borderColor not between", value1, value2, "bordercolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorIsNull() {
            addCriterion("textColor is null");
            return (Criteria) this;
        }

        public Criteria andTextcolorIsNotNull() {
            addCriterion("textColor is not null");
            return (Criteria) this;
        }

        public Criteria andTextcolorEqualTo(String value) {
            addCriterion("textColor =", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorNotEqualTo(String value) {
            addCriterion("textColor <>", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorGreaterThan(String value) {
            addCriterion("textColor >", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorGreaterThanOrEqualTo(String value) {
            addCriterion("textColor >=", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorLessThan(String value) {
            addCriterion("textColor <", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorLessThanOrEqualTo(String value) {
            addCriterion("textColor <=", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorLike(String value) {
            addCriterion("textColor like", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorNotLike(String value) {
            addCriterion("textColor not like", value, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorIn(List<String> values) {
            addCriterion("textColor in", values, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorNotIn(List<String> values) {
            addCriterion("textColor not in", values, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorBetween(String value1, String value2) {
            addCriterion("textColor between", value1, value2, "textcolor");
            return (Criteria) this;
        }

        public Criteria andTextcolorNotBetween(String value1, String value2) {
            addCriterion("textColor not between", value1, value2, "textcolor");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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