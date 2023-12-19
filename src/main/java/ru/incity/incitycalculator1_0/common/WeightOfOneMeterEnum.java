package ru.incity.incitycalculator1_0.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum WeightOfOneMeterEnum {

    FIFTEEN("Труба водогазопроводная д.15",  0.00128540305010893),
    TWENTY("Труба водогазопроводная д.20",  0.00165981735159817),
    TWENTY_FIVE("Труба водогазопроводная д.25",  0.0023937908496732),
    THIRTY_TWO("Труба водогазопроводная д.32",  0.0031063829787234),
    FORTY("Труба водогазопроводная д.40",  0.00384751773049645),
    FIFTY_SEVEN("Труба стальная электросварная д.57",  0.004642166344294),
    SEVENTY_SIX("Труба стальная электросварная д.76",  0.00637931034482759),
    EIGHTY_NINE("Труба стальная электросварная д.89",  0.00854166666666667),
    ONE_HUNDRED_EIGHT("Труба стальная электросварная д.108",  0.0102606255012029),
    ONE_HUNDRED_THIRTY_THREE("Труба стальная электросварная д.133",  0.0127450980392157),
    ONE_HUNDRED_FIFTY_NINE("Труба стальная электросварная д.159",  0.0172413793103448),
    TWO_HUNDRED_NINETEEN("Труба стальная электросварная д.219",  0.02382575757575760);

    private final String displayName;

    private final double weightOfOneMeter;

}
