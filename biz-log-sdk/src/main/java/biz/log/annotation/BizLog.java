package biz.log.annotation;

import java.lang.annotation.*;

/**
 * 操作日志注解
 *
 * @author luchao
 * @date 2021/12/16
 */
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BizLog {

    /**
     * 业务标识
     */
    String bizNo();

    /**
     * 方法调用成功后把 success 记录在日志的内容中
     */
    String success();

    /**
     * 方法调用失败后把 fail 记录在日志的内容中
     */
    String fail() default "";

    // 扩展选项
    /**
     * 拼接在 bizNo 上，避免 bizNo 为纯数字时与其他业务的 ID 重复。
     */
    String prefix() default "";

    /**
     * 详情 或 额外信息
     */
    String detail() default "";

    /**
     * 操作人
     */
    String operator() default "";

    /**
     * 标签，用于分类
     */
    String label() default "";
}
