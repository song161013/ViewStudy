package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    /**
     * appendReplacement 和 appendTail 方法
     */
    public static void main(String[] args) {
        String REGEX = "a*b";
        String INPUT = "aabfooaabfooabfoobkkk";
        String REPLACE = "-";
        Pattern p = Pattern.compile(REGEX);
        // 获取 matcher 对象
        Matcher m = p.matcher(INPUT);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, REPLACE);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }

    /**
     * replaceFirst 和 replaceAll 方法
     */
    public static void main6(String[] args) {
        String regex = "dog";
        String input = "The dog says meow. " +
                "All dogs say meow.";
        String repalce = "cat";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(input);
        input = m.replaceAll(repalce);
        System.out.println(input);
    }

    /**
     * matches 和 lookingAt 方法
     */
    public static void main5(String[] args) {
        final String REGEX = "foo";
        final String INPUT = "fooooooooooooooooo";
        final String INPUT2 = "ooooofoooooooooooo";
        Pattern pattern;
        Matcher matcher;
        Matcher matcher2;

        pattern = Pattern.compile(REGEX);
        matcher = pattern.matcher(INPUT);
        matcher2 = pattern.matcher(INPUT2);

        System.out.println("Current REGEX is: " + REGEX);
        System.out.println("Current INPUT is: " + INPUT);
        System.out.println("Current INPUT2 is: " + INPUT2);


        System.out.println("lookingAt(): " + matcher.lookingAt());
        System.out.println("matches(): " + matcher.matches());
        System.out.println("lookingAt2(): " + matcher2.lookingAt());
        System.out.println("matches2(): " + matcher2.matches());

    }


    /**
     * 对单词“java”出现的次数进行计数
     */
    public static void main4(String[] args) {
        final String input = "android java c++ c java javascript";

        //这个示例主要是使用/b限制java是一个完整的单词而不是一个较长字符串的子串。

        String regex = "\\bjava\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int count = 0;
        while (matcher.find()) {
            count++;
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("conunt=" + count + ",start=" + start + ",end=" + end);
        }
    }

    public static void main3(String[] args) {
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String regex = "(\\D*)(\\d+)(.*)";
        String regex1 = "\\d+";


        Pattern pattern = Pattern.compile(regex1);
        Matcher m = pattern.matcher(line);
        if (m.find(1)) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }

    }

    public static void main2(String[] args) {

        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            System.out.println("Found value: " + m.group(3));
        } else {
            System.out.println("NO MATCH");
        }
    }


    public static void main1(String[] args) {
        String content = "java of regex";
        String partten = ".*java.*";

        boolean isMatches = Pattern.matches(partten, content);
        System.out.println("isContain=" + isMatches);

    }
}


/*
 * \t
 * \r
 * \n
 * \b \B \w /t/r/f/v  /d /D
 */
