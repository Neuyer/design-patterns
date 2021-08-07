package com.neuyer.designpatterns.streeng;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreengStudies {

    public String handleName(String fullName) {

        int nameLength = fullName.split(" ").length;

        if (nameLength == 1)
            return fullName;

        List<String> splitedName =
                Arrays.stream(fullName.split(" "))
                        .collect(Collectors.toList());

        StringBuilder handledName = new StringBuilder();

        for (int i = 0; i < nameLength - 1; i++) {
            handledName.append(splitedName.get(i).substring(0, 1)).append(" ");
        }

        handledName.append(splitedName.get(nameLength - 1));

        return handledName.toString();

    }
}
