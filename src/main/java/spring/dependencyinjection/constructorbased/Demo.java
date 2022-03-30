package spring.dependencyinjection.constructorbased;

//@Configuration
//public class AppConfig {
//
//  @Bean
//  public Item item1() {
//    return new ItemImpl1();
//  }
//
//  @Bean
//  public Store store() {
//    return new Store(item1());
//  }
//}

// Another way to create the configuration of the beans is through XML configuration:
//<bean id="item1" class="org.baeldung.store.ItemImpl1" />
//<bean id="store" class="org.baeldung.store.Store">
//<constructor-arg type="ItemImpl1" index="0" name="item" ref="item1" />
//</bean>
