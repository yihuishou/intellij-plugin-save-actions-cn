package com.dubreuia.ui;

import java.util.Set;

class FileMaskExclusionPanel extends FileMaskPanel {

    private static final String TEXT_TITLE = "排除的文件路径（包扩覆盖的）";

    private static final String TEXT_ADD_OR_EDIT_MESSAGE = "" +
            "<html><body>" +
            "<p>添加排除规则时，只有不匹配的文件才会受到插件的影响。</p>" +
            "<p>（使用区分大小写的Java正则表达式来匹配完整文件路径的后缀）</p>" +
            "<ul>" +
            "<li><strong>Ignore\\.java</strong>              （包括所有文件夹中的所有'.java'文件）</li>" +
            "<li><strong>.*\\.properties</strong>            （包括所有文件夹中包含有'.properties'的文件）</li>" +
            "<li><strong>src/Ignore\\.java</strong>          （在'src'文件夹中包含有'Ignore.java'的文件）</li>" +
            "<li><strong>ignore/.*</strong>                  （递归包含文件夹'ignore'）</li>" +
            "<li><strong>myProject/Ignore.md</strong>        （在项目“myProject”中包含有'Ignore.md'的文件）</li>" +
            "</ul>" +
            "</body></html>";

    private static final String TEXT_ADD_TITLE = "添加被排除的文件路径（正则表达式）";

    private static final String TEXT_EDIT_TITLE = "编辑被排除的文件路径（正则表达式）";

    private static final String TEXT_EMPTY = "排除全部";

    FileMaskExclusionPanel(Set<String> exclusions) {
        super(exclusions, TEXT_EMPTY, TEXT_TITLE, TEXT_ADD_OR_EDIT_MESSAGE, TEXT_ADD_TITLE, TEXT_ADD_OR_EDIT_MESSAGE,
                TEXT_EDIT_TITLE);
    }

}
