package com.dubreuia.ui.java;

import com.dubreuia.model.Action;
import com.intellij.ui.IdeBorderFactory;

import javax.swing.*;
import java.awt.*;
import java.util.Map;

import static com.dubreuia.core.SaveActionFactory.JAVA_AVAILABLE;
import static com.dubreuia.model.Action.explicitTypeCanBeDiamond;
import static com.dubreuia.model.Action.fieldCanBeFinal;
import static com.dubreuia.model.Action.finalPrivateMethod;
import static com.dubreuia.model.Action.localCanBeFinal;
import static com.dubreuia.model.Action.missingOverrideAnnotation;
import static com.dubreuia.model.Action.suppressAnnotation;
import static com.dubreuia.model.Action.unnecessaryFinalOnLocalVariableOrParameter;
import static com.dubreuia.model.Action.unnecessarySemicolon;
import static com.dubreuia.model.Action.unnecessaryThis;
import static com.dubreuia.model.Action.unqualifiedFieldAccess;
import static com.dubreuia.model.Action.useBlocks;

public class InspectionPanel {

    private static final String TEXT_TITLE_INSPECTIONS = "Java代码检查与快速修复";

    private final Map<Action, JCheckBox> checkboxes;

    public InspectionPanel(Map<Action, JCheckBox> checkboxes) {
        this.checkboxes = checkboxes;
    }

    public JPanel getPanel() {
        JPanel panel = new JPanel();
        if (!JAVA_AVAILABLE) {
            return panel;
        }
        panel.setBorder(IdeBorderFactory.createTitledBorder(TEXT_TITLE_INSPECTIONS));
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(checkboxes.get(fieldCanBeFinal));
        panel.add(checkboxes.get(localCanBeFinal));
        panel.add(checkboxes.get(unqualifiedFieldAccess));
        panel.add(checkboxes.get(missingOverrideAnnotation));
        panel.add(checkboxes.get(useBlocks));
        panel.add(checkboxes.get(unnecessaryThis));
        panel.add(checkboxes.get(finalPrivateMethod));
        panel.add(checkboxes.get(unnecessaryFinalOnLocalVariableOrParameter));
        panel.add(checkboxes.get(explicitTypeCanBeDiamond));
        panel.add(checkboxes.get(suppressAnnotation));
        panel.add(checkboxes.get(unnecessarySemicolon));
        panel.add(Box.createHorizontalGlue());
        panel.setMinimumSize(new Dimension(Short.MAX_VALUE, 0));
        return panel;
    }

}
