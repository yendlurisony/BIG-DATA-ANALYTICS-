import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.reducer;
public class WordCountReducer extends Reducer <Text,IntWritable,text,Intwritable> {
  public void reduce( Text key,Iterable<IntWritable> values,Context context) throws IOException,Interrupted exception {
    int sum = 0;
    for(IntWritable value : values) {
      sum+ = value.get();
    }
    context.write(key,new IntWritable(sum))
      }
}
      
  
