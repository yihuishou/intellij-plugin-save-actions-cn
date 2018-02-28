package com.dubreuia.model;

import java.util.LinkedHashSet;
import java.util.Set;

public enum Action {

    // Activation

    activate("在代码保存时激活保存操作（在保存每个文件之前，执行下面的操作）", true),

    activateOnShortcut("在使用快捷键时激活保存操作 (默认 \"CTRL + SHIFT + S\")", false),

    noActionIfCompileErrors("编译出错时不执行操作", false),

    // Global

    organizeImports("组织导入", true),

    reformat("重新格式化代码", true),

    reformatChangedCode("只对已更改的代码重新格式化（仅当配置了VCS时有效）", false),

    rearrange("重新排列字段和方法（在“编辑器 -> 代码样式 -> （...） -> 排列”中配置）", false),

    rearrangeChangedCode("只对已更改的代码重新排列（仅当配置了VCS时有效）", false),

    // Build

    compile("编译文件", false),

    // Java fixes

    fieldCanBeFinal("添加 final 到字段", false),

    localCanBeFinal("添加 final 到本地变量", false),

    unqualifiedFieldAccess("添加 this 到访问的字段", false),

    missingOverrideAnnotation("添加缺少的 @Override 注解", false),

    useBlocks("在 if/while/for 语句中添加代码块", false),

    unnecessaryThis("删除不必要的 this", false),

    finalPrivateMethod("在私有方法中删除 final", false),

    unnecessaryFinalOnLocalVariableOrParameter("删除不必要的用 final 修饰的局部变量或参数", false),

    explicitTypeCanBeDiamond("删除已经显示声明的泛型类型 如( List <A> l = new ArrayList() 后面的 '<A>' ) ", false),

    suppressAnnotation("删除未使用的 @suppress warning 注解", false),

    unnecessarySemicolon("删除不必要的分号", false),;

    private final String text;

    private final boolean defaultValue;

    Action(String text, boolean defaultValue) {
        this.text = text;
        this.defaultValue = defaultValue;
    }

    public boolean isDefaultValue() {
        return defaultValue;
    }

    public String getText() {
        return text;
    }

    public static Set<Action> getDefaults() {
        Set<Action> result = new LinkedHashSet<Action>();
        for (Action action : Action.values()) {
            if (action.isDefaultValue()) {
                result.add(action);
            }
        }
        return result;

    }

}