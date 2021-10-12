module postcard.order.portal {
    opens com.course.msacourse;

    //compile dependencies
    requires spring.boot;
    requires spring.boot.autoconfigure;

    //spring runtime introspection dependencies
    requires spring.context;
    requires spring.core;
    requires spring.beans;

    //for netty low-level API access
    requires jdk.unsupported;
}