package ru.eshmakar.youtube_generation;

import java.util.Random;

public class Rand {

    public String randd() {
        int leftLimit = 45; // symbol '-'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 30; //кол-во букв в сайте
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);

        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
//            if (randomLimitedInt == '/' || randomLimitedInt == '.' || randomLimitedInt == '@' || randomLimitedInt == '?' || randomLimitedInt == '=' || randomLimitedInt == '>' || randomLimitedInt == '<' || randomLimitedInt == ';' || randomLimitedInt == ':' || randomLimitedInt == '[' || randomLimitedInt == ']' || randomLimitedInt == '^' || randomLimitedInt == '`' || randomLimitedInt == '\\')
//                continue;
            buffer.append((char) randomLimitedInt);
        }


        String generatedString = buffer.toString();
        generatedString = generatedString.replace("\\", "").replace("[", "").replace("^", "").replace("?", "").replace("/", "").replace(".", "").replace("@", "").replace("=", "").replace(">", "").replace("<", "").replace(";", "").replace(":", "").replace("]", "").replace("`", "");
        String site = "https://www.youtube.com/watch?v=" + generatedString.substring(0, 11); //переобразует в ссылку
        String blank = "_blank";

        char dm = (char) 34; // символ двойные кавычки, чтобы составить html тег

        return "<p><a href=" + dm + site + dm + " target=" + dm + blank + dm + ">" + site + "</a></p>"; //пишет название сайта, при нажатии открывает сайт в новый вкладке
    }
}

