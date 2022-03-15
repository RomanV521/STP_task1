package com;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    public static final String BACKGROUND = "\033[40m";  // WHITE

    /*


                                 *
                                 **
                                ***         *
                             ****         **
                           ****        ***
                         ****       ****
                        ****       ****
                         ****       ****
                           ***       ****
                             **       ****
                     ***       *     ***               *****
                   ***             **            *   *      **              **
                  ****            *            **            **             **      *****     **         **     *****
                    ***************************             **              **    **     **    **       **    **     **
                    *                                    ***                **      *******     **     **       *******
                  **                         **       **                    **    **     **      **   **      **     **
                   **************************     ***                       **    **     **       ** **       **     **
              *      *                                                      **     ****** **       ***         ****** **
           **      **                    ***                                **
         ***        **********************         *                       **
          ***                                       **                   **
           ***                                    ***
             **************************************     *
                 **                                   **
                   **********************************

    */
    public static void main(String[] args) {
        System.out.println(BACKGROUND + "\t\t\t\t\t\t\t\t " + ANSI_RED + "*\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + "\t\t\t\t\t\t\t\t " + ANSI_RED + "**\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_RED + "\t\t\t\t\t\t\t\t***         *\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_RED + "\t\t\t\t\t\t\t ****         **\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_RED + "\t\t\t\t\t\t   ****        ***\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_RED + "\t\t\t\t\t\t ****       ****\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_RED + "\t\t\t\t\t\t****       ****\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_RED + "\t\t\t\t\t\t ****       ****\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_RED + "\t\t\t\t\t\t   ***       ****\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_RED + "\t\t\t\t\t\t\t **       ****\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t\t\t\t ***"+ ANSI_RED +"\t   *\t ***\t\t\t "+ ANSI_BLUE +" ***** \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t\t\t   ***\t\t\t "+ ANSI_RED +"  **\t\t\t"+ ANSI_BLUE +"*   *\t   **"+ ANSI_RED +"\t\t\t  **\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t\t\t  ****\t\t\t "+ ANSI_RED +" *\t\t\t  "+ ANSI_BLUE +"**\t\t\t**"+ ANSI_RED +"\t\t\t  ** \t *****\t ** \t\t**\t  *****\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t\t\t\t**************************\t\t\t   **"+ ANSI_RED +"\t\t\t  **   **\t  **  **\t   **   **\t   **\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t\t\t\t*\t\t\t\t\t\t\t\t\t***"+ ANSI_RED +"\t\t\t\t  **\t *******   **\t  ** \t  *******\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t\t\t  **\t\t\t\t\t\t** \t\t  **"+ ANSI_RED +"\t\t\t\t  **   **\t  **\t** \t **\t    **\t   **\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t\t\t   *************************\t ***\t\t\t"+ ANSI_RED +"\t\t  **   **\t  **\t ** **\t    **\t   **\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t\t  *\t\t *\t\t\t\t\t\t\t\t\t"+ ANSI_RED +"\t\t\t\t  **\t****** **\t  ***\t\t ****** **\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t   **\t   **\t\t\t\t\t ***\t\t\t\t"+ ANSI_RED +"\t\t\t  **\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t ***\t    **********************\t\t *\t\t"+ ANSI_RED +"\t\t\t\t **\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t  ***\t\t\t\t\t\t\t\t\t  **\t\t"+ ANSI_RED +"\t\t   ** \t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t   ***\t\t\t\t\t\t\t\t\t***\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t\t ************************************     *\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t\t\t **\t\t\t\t\t\t\t\t\t**\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);
        System.out.println(BACKGROUND + ANSI_BLUE + "\t\t\t\t   **********************************\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   "+ ANSI_RESET);

    }

}
