package in.jt;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("temporary")
@Primary
public class TemporaryAddress implements Address {

}
