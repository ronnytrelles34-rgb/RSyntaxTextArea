package org.fife.ui.rsyntaxtextarea.demo;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

public class SyntaxConfig {

    public List<SyntaxDefinition> getSyntaxes() {
        List<SyntaxDefinition> syntaxes = new ArrayList<>();
        syntaxes.add(new SyntaxDefinition("Java", "JavaExample.txt", SyntaxConstants.SYNTAX_STYLE_JAVA));
        syntaxes.add(new SyntaxDefinition("Python", "PythonExample.txt", SyntaxConstants.SYNTAX_STYLE_PYTHON));
        syntaxes.add(new SyntaxDefinition("HTML", "HtmlExample.txt", SyntaxConstants.SYNTAX_STYLE_HTML));
        syntaxes.add(new SyntaxDefinition("JSON", "JsonExample.txt", SyntaxConstants.SYNTAX_STYLE_JSON_WITH_COMMENTS));
        // Aquí puedes seguir agregando más sin tocar DemoRootPane
        return syntaxes;
    }
}
