import com.pickme.config.Config;
import com.pickme.drivertrack.consumers.DriverAndTripConsumer;
import org.apache.kafka.clients.consumer.*;
import org.apache.log4j.BasicConfigurator;

import java.util.Properties;

public class MainTrackDriverLive {
    public static Properties props;
    public static String topicLogin=Config.TOPIC_LOGIN;
    public static String topicShift=Config.TOPIC_SHIFT;
    public static String topicDriver=Config.TOPIC_DRIVER;
    public static String topicDriverLocationChanged=Config.TOPIC_DRIVER_LOCATION_CHANGED;
    public static  String topicTrip=Config.TOPIC_TRIP;
    public static void main(String[] args) {


        BasicConfigurator.configure();


        props = new Properties();

        props.put("enable.auto.commit", Config.AUTO_COMMIT);
        props.put("auto.commit.interval.ms", Config.AUTO_COMMIT_INTERVAL);
        props.put("session.timeout.ms", Config.SESSION_TIME_OUT);

        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, Config.BOOTSTRAP_SERVERS_CONFIG);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, Config.GROUP_ID_CONFIG);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, Config.KEY_DESERIALIZER_CLASS_CONFIG);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, Config.VALUE_DESERIALIZER_CLASS_CONFIG);
        props.put("schema.registry.url",Config.SCHEMA_URL);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, Config.AUTO_OFFSET_RESET_CONFIG);



        DriverAndTripConsumer driverConsumer= new DriverAndTripConsumer(props, topicLogin,topicShift,topicDriver,topicDriverLocationChanged,topicTrip);
        driverConsumer.getdata();







    }


}
