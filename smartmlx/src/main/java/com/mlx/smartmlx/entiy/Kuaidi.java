package com.mlx.smartmlx.entiy;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 项目名：Test2
 * 包名：com.mlx.smartmlx.entiy
 * 创建者：MLX
 * 创建时间：2017/2/7 20:44
 * 用途：查询快递返回的json数据
 */

public class Kuaidi {
    /**
     * resultcode : 200
     * reason : 查询物流信息成功
     * result : {"company":"顺丰","com":"sf","no":"358437330494","status":"1","list":[{"datetime":"2017-02-01 08:30:22","remark":"顺丰速运 已收取快件","zone":""},{"datetime":"2017-02-01 09:08:43","remark":"快件在【长治市城区紫金营业点】已装车，准备发往 【长治高新集散中心】","zone":""},{"datetime":"2017-02-01 12:37:25","remark":"快件到达 【长治高新集散中心】","zone":""},{"datetime":"2017-02-01 12:45:44","remark":"快件在【长治高新集散中心】已装车，准备发往 【太原小店集散中心】","zone":""},{"datetime":"2017-02-01 22:50:12","remark":"快件到达 【太原小店集散中心】","zone":""},{"datetime":"2017-02-02 01:14:10","remark":"快件在【太原小店集散中心】已装车，准备发往下一站","zone":""},{"datetime":"2017-02-02 12:49:55","remark":"快件到达 【北京首都机场集散中心2】","zone":""},{"datetime":"2017-02-02 14:55:27","remark":"快件在【北京首都机场集散中心2】已装车，准备发往 【北京顺义集散中心】","zone":""},{"datetime":"2017-02-02 17:17:55","remark":"快件到达 【北京顺义集散中心】","zone":""},{"datetime":"2017-02-03 01:32:49","remark":"快件在【北京顺义集散中心】已装车，准备发往 【北京丰台韩庄子营业点】","zone":""},{"datetime":"2017-02-03 07:53:28","remark":"快件到达 【北京丰台韩庄子营业点】","zone":""},{"datetime":"2017-02-03 08:11:38","remark":"正在派送途中,请您准备签收(派件人:张运卜,电话:13501062654)","zone":""},{"datetime":"2017-02-03 09:12:33","remark":"已签收,感谢使用顺丰,期待再次为您服务","zone":""}]}
     * error_code : 0
     */

    @SerializedName("resultcode")
    private String resultcode;
    @SerializedName("reason")
    private String reason;
    @SerializedName("result")
    private ResultBean result;
    @SerializedName("error_code")
    private int errorCode;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public static class ResultBean {
        /**
         * company : 顺丰
         * com : sf
         * no : 358437330494
         * status : 1
         * list : [{"datetime":"2017-02-01 08:30:22","remark":"顺丰速运 已收取快件","zone":""},{"datetime":"2017-02-01 09:08:43","remark":"快件在【长治市城区紫金营业点】已装车，准备发往 【长治高新集散中心】","zone":""},{"datetime":"2017-02-01 12:37:25","remark":"快件到达 【长治高新集散中心】","zone":""},{"datetime":"2017-02-01 12:45:44","remark":"快件在【长治高新集散中心】已装车，准备发往 【太原小店集散中心】","zone":""},{"datetime":"2017-02-01 22:50:12","remark":"快件到达 【太原小店集散中心】","zone":""},{"datetime":"2017-02-02 01:14:10","remark":"快件在【太原小店集散中心】已装车，准备发往下一站","zone":""},{"datetime":"2017-02-02 12:49:55","remark":"快件到达 【北京首都机场集散中心2】","zone":""},{"datetime":"2017-02-02 14:55:27","remark":"快件在【北京首都机场集散中心2】已装车，准备发往 【北京顺义集散中心】","zone":""},{"datetime":"2017-02-02 17:17:55","remark":"快件到达 【北京顺义集散中心】","zone":""},{"datetime":"2017-02-03 01:32:49","remark":"快件在【北京顺义集散中心】已装车，准备发往 【北京丰台韩庄子营业点】","zone":""},{"datetime":"2017-02-03 07:53:28","remark":"快件到达 【北京丰台韩庄子营业点】","zone":""},{"datetime":"2017-02-03 08:11:38","remark":"正在派送途中,请您准备签收(派件人:张运卜,电话:13501062654)","zone":""},{"datetime":"2017-02-03 09:12:33","remark":"已签收,感谢使用顺丰,期待再次为您服务","zone":""}]
         */

        @SerializedName("company")
        private String company;
        @SerializedName("com")
        private String com;
        @SerializedName("no")
        private String no;
        @SerializedName("status")
        private String status;
        @SerializedName("list")
        private List<ListBean> list;

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getCom() {
            return com;
        }

        public void setCom(String com) {
            this.com = com;
        }

        public String getNo() {
            return no;
        }

        public void setNo(String no) {
            this.no = no;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * datetime : 2017-02-01 08:30:22
             * remark : 顺丰速运 已收取快件
             * zone :
             */

            @SerializedName("datetime")
            private String datetime;
            @SerializedName("remark")
            private String remark;
            @SerializedName("zone")
            private String zone;

            public String getDatetime() {
                return datetime;
            }

            public void setDatetime(String datetime) {
                this.datetime = datetime;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getZone() {
                return zone;
            }

            public void setZone(String zone) {
                this.zone = zone;
            }
        }
    }
}
