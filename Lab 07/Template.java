public class Template {
    private String word, template;

    Template ()
    {
        word="";
        template="";
    }

    public void setWord (String newWord)
    {
        word=newWord;
        int i=0;
        template="";
        while (i<word.length())
        {
            template = template+"-";
            i++;
        }
    }

    public String getTemplate()
    {
        return template;
    }

    public void guess(char letter)
    {
        int i=0; String before, after;
        while (i<word.length())
        {
            if (word.charAt(i) == letter) // Used debug here to understand how statement being checked
            {
                before=template.substring(0,i);
                after=template.substring(i+1,template.length()); // Debuged this whole method to see how letters are being placed . Fixed 2 errors here .
                template = before+letter+after;
            }
            i++;
        }
    }

    public boolean guess(String word)
    {
        if (this.word.equalsIgnoreCase(word))
            return true;
        else return false;
    }
}

