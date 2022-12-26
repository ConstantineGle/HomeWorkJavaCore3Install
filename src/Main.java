import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {

        String rootPath = "D://Games";
        String src = "src";
        String res = "res";
        String saveGames = "savegames";
        String temp = "temp";
        String main = "main";
        String test = "test";
        String drawables = "drawables";
        String vectors = "vectors";
        String icons = "icons";

        StringBuilder stringBuilder = new StringBuilder();
        Date date = new Date();

        File dirRoot = new File(rootPath);

        File dirSrc = new File(dirRoot, src);
        if (dirSrc.mkdir())
            stringBuilder.append(date + " Каталог " + src + " создан \n");
        //System.out.println("Каталог " + src + " создан");


        File dirMain = new File(dirRoot + "\\" + src, main);
        if (dirMain.mkdir())
            stringBuilder.append(date + " Каталог " + main + " создан \n");
        //System.out.println("Каталог " + main + " создан");


        File fileMain = new File(dirRoot + "\\" + src + "\\" + main + "//Main.java");
        try {
            if (fileMain.createNewFile())
                stringBuilder.append(date + " Файл Main.java создан \n");
            //System.out.println("Файл был создан");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File fileUtils = new File(dirRoot + "\\" + src + "\\" + main + "//Utils.java");
        try {
            if (fileUtils.createNewFile())
                stringBuilder.append(date + " Файл Utils.java создан \n");
            //System.out.println("Файл был создан");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        File dirTest = new File(dirRoot + "\\" + src, test);
        if (dirTest.mkdir())
            stringBuilder.append(date + " Каталог " + test + " создан \n");
        //System.out.println("Каталог " + test + " создан");


        File dirRes = new File(dirRoot, res);
        if (dirRes.mkdir())
            stringBuilder.append(date + " Каталог " + res + " создан \n");
        //System.out.println("Каталог " + res + " создан");

        File dirDrawables = new File(dirRoot + "\\" + res, drawables);
        if (dirDrawables.mkdir())
            stringBuilder.append(date + " Каталог " + drawables + " создан \n");
        //System.out.println("Каталог " + drawables + " создан");

        File dirVectors = new File(dirRoot + "\\" + res, vectors);
        if (dirVectors.mkdir())
            stringBuilder.append(date + " Каталог " + vectors + " создан \n");
        //System.out.println("Каталог " + vectors + " создан");

        File dirIcons = new File(dirRoot + "\\" + res, icons);
        if (dirIcons.mkdir())
            stringBuilder.append(date + " Каталог " + icons + " создан \n");
        //System.out.println("Каталог " + icons + " создан");


        File dirSavegames = new File(dirRoot, saveGames);
        if (dirSavegames.mkdir())
            stringBuilder.append(date + " Каталог " + saveGames + " создан \n");
        //System.out.println("Каталог " + saveGames + " создан");

        File dirTemp = new File(dirRoot, temp);
        if (dirTemp.mkdir())
            stringBuilder.append(date + " Каталог " + temp + " создан \n");
        //System.out.println("Каталог " + temp + " создан");

        File fileTemp = new File(dirRoot + "\\" + temp + "//temp.txt");
        try {
            if (fileTemp.createNewFile())
                stringBuilder.append(date + " Файл temp.txt создан \n");
            //System.out.println("Файл был создан");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileWriter fileWriter = new FileWriter(fileTemp);
            fileWriter.write(String.valueOf(stringBuilder));
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}