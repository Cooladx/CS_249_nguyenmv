package edu.nguyenmv.assign03;

public class GreetingCard
{
    private String[] lines;
    private char boundaryChar;
    private static final int MAX_WIDTH = 50;



    public GreetingCard(String[] lines, char boundaryChar)
    {
        setBoundaryChar(boundaryChar);
        setLines(lines);
    }

    public char getBoundaryChar()
    {
        return boundaryChar;
    }

    public String getLines()
    {
        StringBuilder gLines = new StringBuilder();
        for(String line : this.lines)
        {
            gLines.append(line).append("\n");
        }
        return gLines.toString();
    }

    public void setBoundaryChar(char boundaryChar)
    {
         this.boundaryChar = boundaryChar;
    }



    public void setLines(String[] lines)
    {
        // Creates the lines meant for THIS object specifically
    this.lines = new String[lines.length];
        for (int i = 0; i < lines.length; i++)
        {
            this.lines[i] = lines[i];
        }

    }

    public String generateBoundaryLine()
    {
        StringBuilder gBoundaryLine = new StringBuilder();
        for (int i = 0; i < MAX_WIDTH; i++)
        {
            gBoundaryLine.append(boundaryChar);
        }
        // Add new line after boundaryChars are all appended to the line
        gBoundaryLine.append("\n");
        return gBoundaryLine.toString();
    }

    public String generateCenteredLine(String text)
    {

    if (text.length() > 0)
        text = " " + text + " ";

        int totalPadding = MAX_WIDTH - text.length();
        int leftPadding = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding;

        // Using stringBuilder to append to the paddings
        StringBuilder centerPad = new StringBuilder();

        for (int i = 0; i < leftPadding; i++)
        {
            centerPad.append(boundaryChar);
        }
        // Goes after left padding
        centerPad.append(text);
        // Goes before right padding
        for (int i = 0; i < rightPadding; i++)
            centerPad.append(boundaryChar);

        centerPad.append("\n");
        return centerPad.toString();
    }


    public String toString()
    {

/*
Each card will have the following dimensions:
▪ 50 characters in width
▪ 9 lines in height
o Start with an empty String (or you can use String builder)
o For every 5 lines:
▪ If we already have text, append a newline (to put a separator between cards)
▪ Append two boundary lines
▪ Compute how many lines are left at this point
▪ If the number of lines left are less than 5:
• Line count will be however many lines are left
• Extra line count will be 5 – (lines left)
▪ Otherwise:
• Line count will be 5
• Extra line count will be zero
▪ Append (line count) number of lines from your array of lines
▪ Append (extra line count) number of boundary lines
▪ Append two boundary lines regardless
o Return the single String containing all of these greeting cards

 */
        StringBuilder cardCreator = new StringBuilder();
        int totalLines = lines.length;

        for (int i = 0; i < totalLines; i+= 5)
        {
            if (cardCreator.length() > 0)
            {
                cardCreator.append("\n");
            }
            cardCreator.append(generateBoundaryLine());
            cardCreator.append(generateBoundaryLine());

            int linesLeft = totalLines - i;
            int lineCnt;
            int extraLineCnt;

            if (linesLeft < 5)
            {
                lineCnt = linesLeft;
                extraLineCnt = 5 - linesLeft;
            }

            else
            {
                lineCnt = 5;
                extraLineCnt = 0;
            }

            for (int j = 0; j < lineCnt; j++)
            {
            cardCreator.append(generateCenteredLine(lines[i + j]));
            }

            for (int j = 0; j < extraLineCnt; j++)
            {
            cardCreator.append(generateBoundaryLine());
            }





            cardCreator.append(generateBoundaryLine());
            cardCreator.append(generateBoundaryLine());

        }


        return cardCreator.toString();

    }


}
