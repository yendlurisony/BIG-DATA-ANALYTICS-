import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.mapper <LongWritable,Text,Text,IntWritable>
{
  private final static IntWritable one = new IntWritable(1);
  private text word = new Text();
  //Override
  public void map(LongWritable key,Text value,Contextcontext) throws IOException,Interrupted Exception {

  //convert the input values to a string
    String Line = value.toString();

  //Tokenize the line into words
  String[] words = line.aplit("\\s+");
  {
    w = w.trim().tolowerCase();
    if (!w.isEmpty()) {
                word.set(w);
                context.write(word, one);
            }
        }
    }
}
