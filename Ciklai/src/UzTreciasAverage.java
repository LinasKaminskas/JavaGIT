import java.io.*;

public class UzTreciasAverage {
    public static void main(String[] args) throws IOException {
        try {
            String filePath = "C:\\Users\\Nemesis\\IdeaProjects\\Ciklai\\res\\NaujasTekstas";
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            int sum = 0;
            int count = 0;
            String line = br.readLine();
            while (line != null) {
                sum += Integer.parseInt(line); //String konvertuojamas i int
                count++;
                line = br.readLine();
            }
            br.close();
            double average = (double) sum / count;
            PrintWriter answer = new PrintWriter("C:\\Users\\Nemesis\\IdeaProjects\\Ciklai\\res\\AverageTekstas");
            answer.print(average);
            answer.println();
            answer.close();
            System.out.println("Done");

            System.out.println("Sum: " + sum + " " + "Count: " + count + " " + "Average: " + average);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    }



