package com.dubreuia.ui;

import java.util.Set;

class FileMaskInclusionPanel extends FileMaskPanel {

    private static final String TEXT_TITLE = "受影响的文件范围（如果为空则全部受影响）";

    private static final String TEXT_ADD_OR_EDIT_MESSAGE = "" +
            "<html><body>" +
            "<p>当该列表为空时，所有的文件都将包含在内。" +
            " 添加文件包含规则时，则只有匹配的文件才会受到插件的影响。</p>" +
            "<p>（使用区分大小写的Java正则表达式来匹配完整文件路径的后缀）</p>" +
            "<ul>" +
            "<li><strong>.*\\.java</strong>                  （包括所有文件夹中的所有'.java'文件）</li>" +
            "<li><strong>Include\\.java</strong>             （包括所有文件夹中包含有'Include.java'的文件）</li>" +
            "<li><strong>src/Include\\.java</strong>         （在'src'文件夹中包含有'Include.java'的文件）</li>" +
            "<li><strong>src/.*</strong>                     （递归包含文件夹'src'）</li>" +
            "<li><strong>myProject/Include.md</strong>       （在项目“myProject”中包含有'Include.md'的文件）</li>" +
            "</ul>" +
            "</body></html>";

    private static final String TEXT_ADD_TITLE = "添加被包括的文件路径（正则表达式）";

    private static final String TEXT_EDIT_TITLE = "编辑被包括的文件路径（正则表达式）";

    private static final String TEXT_EMPTY = "包括全部";

    FileMaskInclusionPanel(Set<String> inclusions) {
        super(inclusions, TEXT_EMPTY, TEXT_TITLE, TEXT_ADD_OR_EDIT_MESSAGE, TEXT_ADD_TITLE, TEXT_ADD_OR_EDIT_MESSAGE,
                TEXT_EDIT_TITLE);
    }

}
