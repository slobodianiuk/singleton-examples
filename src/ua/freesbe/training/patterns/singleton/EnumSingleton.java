package ua.freesbe.training.patterns.singleton;

/**
 * Joshua Bloch`s choice
 *
 * + Serialization from box
 * + Thread safe from box
 * + Possibility to use <switch>EnumSet, EnumMap</switch>
 * + Support <code>switch</code>
 *
 * - Not lazy initialization
 */
public enum EnumSingleton {
    INSTANCE
}
