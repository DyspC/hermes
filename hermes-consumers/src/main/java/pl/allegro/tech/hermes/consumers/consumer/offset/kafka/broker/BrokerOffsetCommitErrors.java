package pl.allegro.tech.hermes.consumers.consumer.offset.kafka.broker;

import com.google.common.base.Joiner;
import pl.allegro.tech.hermes.common.broker.TopicAndPartition;

import java.util.Map;

public class BrokerOffsetCommitErrors {

    private final Joiner.MapJoiner mapJoiner = Joiner.on(',').withKeyValueSeparator("=");
    private final Map<TopicAndPartition, Object> errors;

    public BrokerOffsetCommitErrors(Map<TopicAndPartition, Object> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return mapJoiner.join(errors);
    }
}
