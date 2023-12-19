package ru.incity.incitycalculator1_0.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum PipeDiameterEnum {
    FIFTEEN_TIMES_TWO_POINT_EIGHT("Труба водогазопроводная д.15x2.8", 0.0206),
    TWENTY_TIMES_TWO_POINT_EIGHT("Труба водогазопроводная д.20x2.8", 0.0256),
    TWENTY_FIVE_TIMES_THREE_POINT_TWO("Труба водогазопроводная д.25x3.2", 0.0314),
    THIRTY_TWO_TIMES_THREE_POINT_TWO("Труба водогазопроводная д.32x3.2", 0.0384),
    FORTY_TIMES_THREE_POINT_FIVE("Труба водогазопроводная д.40x3.5", 0.047),
    FIFTY_TIMES_THREE_POINT_FIVE("Труба стальная электросварная д.50x3.5", 0.057),
    SIXTY_FIVE_TIMES_FOUR_POINT_ZERO("Труба стальная электросварная д.65x4.0", 0.073),
    EIGHTY_TIMES_FOUR_POINT_ZERO("Труба стальная электросварная д.80x4.0", 0.088),
    ONE_HUNDRED_TIMES_FOUR_POINT_ZERO("Труба стальная электросварная д.100x4.0", 0.108),
    ONE_HUNDRED_THIRTY_THREE_TIMES_FOUR_POINT_FIVE("Труба стальная электросварная д.133x4.5", 0.142),
    ONE_HUNDRED_FIFTY_NINE_TIMES_FOUR_POINT_FIVE("Труба стальная электросварная д.159x4.5", 0.168);

    private final String displayName;

    private final double diameterWithTwoWalls;

}
