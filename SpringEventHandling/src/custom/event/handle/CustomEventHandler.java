package custom.event.handle;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CustomEventHandler implements ApplicationListener<CustomEvent>  {

	public void onApplicationEvent(CustomEvent event) {
		System.out.println(event.toString());
	}

}
