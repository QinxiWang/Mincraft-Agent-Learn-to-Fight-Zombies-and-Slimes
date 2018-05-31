//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.03.08 at 03:19:44 PM CST 
//


package com.microsoft.Malmo.Schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscreteMovementCommand.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DiscreteMovementCommand">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="move"/>
 *     &lt;enumeration value="jumpmove"/>
 *     &lt;enumeration value="strafe"/>
 *     &lt;enumeration value="jumpstrafe"/>
 *     &lt;enumeration value="turn"/>
 *     &lt;enumeration value="movenorth"/>
 *     &lt;enumeration value="moveeast"/>
 *     &lt;enumeration value="movesouth"/>
 *     &lt;enumeration value="movewest"/>
 *     &lt;enumeration value="jumpnorth"/>
 *     &lt;enumeration value="jumpeast"/>
 *     &lt;enumeration value="jumpsouth"/>
 *     &lt;enumeration value="jumpwest"/>
 *     &lt;enumeration value="jump"/>
 *     &lt;enumeration value="look"/>
 *     &lt;enumeration value="attack"/>
 *     &lt;enumeration value="use"/>
 *     &lt;enumeration value="jumpuse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DiscreteMovementCommand")
@XmlEnum
public enum DiscreteMovementCommand {

    @XmlEnumValue("move")
    MOVE("move"),
    @XmlEnumValue("jumpmove")
    JUMPMOVE("jumpmove"),
    @XmlEnumValue("strafe")
    STRAFE("strafe"),
    @XmlEnumValue("jumpstrafe")
    JUMPSTRAFE("jumpstrafe"),
    @XmlEnumValue("turn")
    TURN("turn"),
    @XmlEnumValue("movenorth")
    MOVENORTH("movenorth"),
    @XmlEnumValue("moveeast")
    MOVEEAST("moveeast"),
    @XmlEnumValue("movesouth")
    MOVESOUTH("movesouth"),
    @XmlEnumValue("movewest")
    MOVEWEST("movewest"),
    @XmlEnumValue("jumpnorth")
    JUMPNORTH("jumpnorth"),
    @XmlEnumValue("jumpeast")
    JUMPEAST("jumpeast"),
    @XmlEnumValue("jumpsouth")
    JUMPSOUTH("jumpsouth"),
    @XmlEnumValue("jumpwest")
    JUMPWEST("jumpwest"),
    @XmlEnumValue("jump")
    JUMP("jump"),
    @XmlEnumValue("look")
    LOOK("look"),
    @XmlEnumValue("attack")
    ATTACK("attack"),
    @XmlEnumValue("use")
    USE("use"),
    @XmlEnumValue("jumpuse")
    JUMPUSE("jumpuse");
    private final String value;

    DiscreteMovementCommand(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DiscreteMovementCommand fromValue(String v) {
        for (DiscreteMovementCommand c: DiscreteMovementCommand.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
