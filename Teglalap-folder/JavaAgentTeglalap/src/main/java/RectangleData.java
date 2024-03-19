import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;

@Aspect
 class RectangleAspect {

    @After("execution(example.Teglalap.new(double, double)) && args(a, b)") //itt figyeljük meg a Teglalap osztaly konstruktorat
    public void teglalapConstructor(double a, double b) {
        try {
            TeglalapData data = new TeglalapData(a, b);
            Gson gson = new Gson();
            String json = gson.toJson(data);
            FileWriter writer = new FileWriter("teglalap.json"); //beleírjuk a kinyert adatokat a teglalap.json file-ba
            writer.write(json);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

class TeglalapData {
    double a;
    double b;

    TeglalapData(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
