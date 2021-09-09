package testPack;

/* 世界のナベアツさんの有名な「3の倍数だけ馬鹿になる」から着想を得たプログラムです。
変数 screemingNum で指定した数の倍数の時に,人物のAAと数字のAAが現れます。
何桁の数値でもOKです。コマンドプロンプトのウィンドウ幅を広げて実行してください。
*/

import java.io.*;

public class NabeatsuTheWorld {
    public static void main(String[] args) throws InterruptedException {
        final int screemingNum = 3;                     //倍数と値が付く数値になるとNabeatsuTheWorldが現れる数値
        int maxNum ;                                    //1〜入力された数まで表示するための変数

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("正の整数を入力してください");
        System.out.println("入力の数まで1から読み上げ、NabeatsuTheWorldが 3 の倍数の時に現れます");
        try {
            String str = reader.readLine();             //入力
            maxNum = Integer.parseInt(str);             //入力を maxNum へ代入
            for (int i = 1 ; i <= maxNum ; i++){        //数値を maxNumまで出力するループ
                Thread.sleep(1000);
                if (i % screemingNum == 0 || String.valueOf(i).matches("^.*" + screemingNum + ".*$") ) {            //screemingNumで割り切れるか（倍数か）or screemingNumを含むか
                    for (int j = 0 ; j < 16 ; j++){     // ifがtrueならAAを表示させる。マジックナンバー 16 はAAの行数
                        nabeatsuAA(j);
                        generateAANum(i, j);
                        System.out.println("");
                    }
                    System.out.println("");
                } else {                                //ifがfalseなら顔文字と数値を出力
                    System.out.println("     (´O｀) < " + i);
                    System.out.println("");
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    /* AA「NabeatsuTheWorld」を1行ずつ出力するメソッド  j = メインメソッド二重ループからの引数 */
    public static void nabeatsuAA(int j) {
        String[] nabeatsuArray = {
            "                      イ三三三三                   ",
            "                 ／イニニニニ＼ヽ＼ゝ＿            ",
            "              ／イニニニニニ＼＼V/彡＼             ",
            "              |三ニ＞───､＼V//彡＼ヽヽ             ",
            "              |三ニ|                ￣  ＼＼ヽ|    ",
            "             ﾊ三シ∠ミヽ,                ＼ミ l     ",
            "            ｛!ﾚ/    ﾐゝ.,_         ∠三ゝ  |ミ l   ",
            "             | ﾚ   彡ヽ｀'ゝ      f=・xﾐ;    |/    ",
            "             '┤          ノ    i  ｀''        /}   ",
            "              l    ｰイ⌒(､    ':i          / /    ",
            "              |      《三ヲ｀7≦         〃        ",
            "              ﾄ、    斤 ￣｀''キ≧     /´          ",
            "           ＜| 丶    ヽニ--ソ'\"    ／            ",
            "          ﾉ|  ＼ ＼      ￣     ／＼              ",
            "       ／  l  / ヽ、ヽﾐ  ＿彡'´.〉   /＼           ",
            "_＿／     .ﾄ､ヽ    i        |   /    |.    ＼＿   "
        };
        System.out.printf("%-40s" , nabeatsuArray[j]);
    }
    /* AAの数字を一行ずつ出力するメソッド。i = 表示させる数値  j = メインメソッド二重ループからの引数 */
    public static void generateAANum(int i , int j) {
        int numLen = String.valueOf(i).length();        //桁数を取得
        for (int k = 0 ; k < numLen ; k++){             //桁数分ループさせる
            String numStr = String.valueOf(i);          //桁ごとに数列を分けるために型変換
            char xNum = numStr.charAt(k);               //ループ数=桁数にする。数列を分解するために型変換
            int numForSwitch = Character.getNumericValue(xNum);     //char型からint型へ型変換
            switch (numForSwitch) {                     //桁ごとに分解した数値でswitch。各数値のAA出力メソッドを呼び出し。
                case 0 :
                    numberAA0(j);
                    break;
                
                case 1 :
                    numberAA1(j);
                    break;

                case 2 :
                    numberAA2(j);
                    break;

                case 3 :
                    numberAA3(j);
                    break;

                case 4 :
                    numberAA4(j);
                    break;

                case 5 :
                    numberAA5(j);
                    break;

                case 6 :
                    numberAA6(j);
                    break;

                case 7 :
                    numberAA7(j);
                    break;

                case 8 :
                    numberAA8(j);
                    break;

                case 9 :
                    numberAA9(j);
                    break;
            }
        }
    }
    /*以下数値のAAを1行ずつ出力するメソッド */
    public static void numberAA1(int j) {
        String[] array1 = {
            "  ■■ ",
            " ■ ■ ",
            "   ■ ",
            "   ■ ",
            "   ■ ",
            "   ■ ",
            "   ■ ",
            "   ■ ",
            "   ■ ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
        };
        System.out.printf("%-10s" ,array1[j]);
    }
    public static void numberAA2(int j) {
        String[] array2 = {
            "  ■■■■   ",
            " ■■  ■■  ",
            "      ■  ",
            "      ■  ",
            "    ■■   ",
            "   ■     ",
            "  ■      ",
            " ■       ",
            " ■■■■■■■ ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         "
        };
        System.out.printf("%-10s" ,array2[j]);
    }
    public static void numberAA3(int j) {
        String[] array3 = {
            "  ■■■■  ",
            " ■   ■■ ",
            "      ■ ",
            "     ■  ",
            "   ■■■  ",
            "     ■■ ",
            "      ■ ",
            " ■   ■■ ",
            "  ■■■■  ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        "
        };
        System.out.printf("%-10s" ,array3[j]);
    }
    public static void numberAA4(int j) {
        String[] array4 = {
            "      ■   ",
            "     ■■   ",
            "    ■ ■   ",
            "   ■  ■   ",
            "  ■   ■   ",
            "  ■   ■   ",
            " ■■■■■■■■ ",
            "      ■   ",
            "      ■   ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          ",
            "          "
        };
        System.out.printf("%-10s" ,array4[j]);
    }
    public static void numberAA5(int j) {
        String[] array5 = {
            "  ■■■■■ ",
            "  ■     ",
            " ■■     ",
            " ■■■■■  ",
            " ■■  ■■ ",
            "      ■ ",
            "      ■ ",
            " ■■  ■■ ",
            "  ■■■■  ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        "
        };
        System.out.printf("%-10s" ,array5[j]);
    }
    public static void numberAA6(int j) {
        String[] array6 = {
            "   ■■■■ ",
            "  ■   ■ ",
            " ■■     ",
            " ■ ■■■  ",
            " ■■   ■ ",
            " ■    ■ ",
            " ■    ■ ",
            "  ■   ■ ",
            "   ■■■  ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        "
        };
        System.out.printf("%-10s" ,array6[j]);
    }
    public static void numberAA7(int j) {
        String[] array7 = {
            " ■■■■■■ ",
            "      ■ ",
            "     ■  ",
            "     ■  ",
            "    ■   ",
            "    ■   ",
            "   ■    ",
            "   ■    ",
            "  ■■    ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        "
        };
        System.out.printf("%-10s" ,array7[j]);
    }
    public static void numberAA8(int j) {
        String[] array8 = {
            "  ■■■■   ",
            " ■■  ■■  ",
            " ■    ■  ",
            " ■■  ■■  ",
            "  ■■■■   ",
            " ■■  ■■  ",
            " ■    ■■ ",
            " ■    ■  ",
            "  ■■■■   ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         "
        };
        System.out.printf("%-10s" ,array8[j]);
    }
    public static void numberAA9(int j) {
        String[] array9 = {
            "  ■■■■  ",
            " ■■  ■■ ",
            " ■    ■ ",
            " ■    ■ ",
            " ■■  ■■ ",
            "  ■■■ ■ ",
            "      ■ ",
            " ■   ■  ",
            "  ■■■   ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        ",
            "        "
        };
        System.out.printf("%-10s" ,array9[j]);
    }
    public static void numberAA0(int j) {
        String[] array0 = {
            "  ■■■■   ",
            " ■■  ■■  ",
            " ■    ■  ",
            " ■    ■  ",
            " ■    ■■ ",
            " ■    ■  ",
            " ■    ■  ",
            " ■■  ■■  ",
            "  ■■■■   ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         "
        };
        System.out.printf("%-10s" ,array0[j]);
    }
}
