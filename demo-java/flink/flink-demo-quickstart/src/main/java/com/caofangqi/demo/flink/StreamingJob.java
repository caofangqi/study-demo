package com.caofangqi.demo.flink;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.shaded.curator.org.apache.curator.shaded.com.google.common.base.Splitter;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.util.Collector;

/**
 * @author caofangqi
 * @since 2019/10/12 11:22 下午
 */
public class StreamingJob {

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<Tuple2<String, Integer>> dataStreaming =
            env.socketTextStream("localhost", 9999).flatMap(new Splitter()).keyBy(0).timeWindow(Time.seconds(5)).sum(1);

        dataStreaming.print();
        env.execute("Flink Streaming Java API Skeleton");
    }

    public static class Splitter implements FlatMapFunction<String, Tuple2<String, Integer>> {

        public void flatMap(String sentence, Collector<Tuple2<String, Integer>> out) throws Exception {
            for (String word : sentence.split(" ")) {
                out.collect(new Tuple2<String, Integer>(word, 1));
            }
        }

    }

}
