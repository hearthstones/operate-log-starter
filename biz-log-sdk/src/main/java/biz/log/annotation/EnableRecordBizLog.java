package biz.log.annotation;

import java.lang.annotation.*;

/**
 * 开启操作日志组件
 *
 * @author luchao
 * @date 2021/12/16
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EnableRecordBizLog {

}
