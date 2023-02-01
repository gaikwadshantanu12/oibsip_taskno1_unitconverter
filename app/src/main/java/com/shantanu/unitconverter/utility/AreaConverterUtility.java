package com.shantanu.unitconverter.utility;

public class AreaConverterUtility {
    /* converting area from acres to all s1 = 0, s1 = 0 -> 6 */
    public double FromAcresToAcres(double acres) {
        return acres;
    }

    public double FromAcresToAres(double acres) {
        return acres * 40.468564224;
    }

    public double FromAcresToHectares(double acres) {
        return acres * 0.4046856422;
    }

    public double FromAcresToSquareCentimetres(double acres) {
        return acres * 40468564.224;
    }

    public double FromAcresToSquareFeet(double acres) {
        return acres * 43560;
    }

    public double FromAcresToSquareInches(double acres) {
        return  acres * 6272640;
    }

    public double FromAcresToSquareMetres(double acres) {
        return acres * 4046.8564224;
    }

    /* converting from ares to all s1 = 1, s1 = 0 -> 6 */
    public double FromAresToAres(double ares) {
        return ares;
    }

    public double FromAresToAcres(double ares) {
        return ares * 0.0247105381;
    }

    public double FromAresToHectares(double ares) {
        return ares * 0.01;
    }

    public double FromAresToSquareCentimetres(double ares) {
        return ares * 1000000;
    }

    public double FromAresToSquareFeet(double ares) {
        return ares * 1076.391041671;
    }

    public double FromAresToSquareInches(double ares) {
        return ares * 155000.31000062;
    }

    public double FromAresToSquareMetres(double ares) {
        return ares * 100;
    }

    /* converting from hectares to all */
    public double FromHectaresToHectares(double hectares) {
        return hectares;
    }

    public double FromHectaresToAcres(double hectares) {
        return hectares * 2.4710538147;
    }

    public double FromHectaresToAres(double hectares) {
        return hectares * 100;
    }

    public double FromHectaresToSquareCentimetres(double hectares) {
        return hectares * 100000000;
    }

    public double FromHectaresToSquareFeet(double hectares) {
        return hectares * 107639.1041671;
    }

    public double FromHectaresToSquareInches(double hectares) {
        return hectares * 15500031.000062;
    }

    public double FromHectaresToSquareMetres(double hectares) {
        return hectares * 10000;
    }

    /* converting from square centimetres to all */
    public double FromSquareCentimetresToSquareCentimetres(double sqcm) {
        return sqcm;
    }

    public double FromSquareCentimetresToAcres(double sqcm) {
        return sqcm * 2.47105381e-8;
    }

    public double FromSquareCentimetresToAres(double sqcm) {
        return sqcm * 0.000001;
    }

    public double FromSquareCentimetresToHectares(double sqcm) {
        return sqcm * 100000000e-8;
        // or return sqcm;
    }

    public double FromSquareCentimetresToSquareFeet(double sqcm) {
        return sqcm * 0.001076391;
    }

    public double FromSquareCentimetresToSquareInches(double sqcm) {
        return sqcm * 0.15500031;
    }

    public double FromSquareCentimetresToSquareMetres(double sqcm) {
        return sqcm * 0.0001;
    }

    /* converting square feet to all */
    public double FromSquareFeetToSquareFeet(double sqft) {
        return sqft;
    }

    public double FromSquareFeetToAcres(double sqft) {
        return sqft * 0.0000229568;
    }

    public double FromSquareFeetToAres(double sqft) {
        return sqft * 0.0009290304;
    }

    public double FromSquareFeetToHectares(double sqft) {
        return sqft * 0.0000092903;
    }

    public double FromSquareFeetToSquareCentimetres(double sqft) {
        return sqft * 929.0304;
    }

    public double FromSquareFeetToSquareInches(double sqft) {
        return sqft * 144;
    }

    public double FromSquareFeetToSquareMetres(double sqft) {
        return sqft * 0.09290304;
    }

    /* converting square inches to all */
    public double FromSquareInchesToSquareInches(double sqin) {
        return sqin;
    }

    public double FromSquareInchesToAcres(double sqin) {
        return sqin * 1.59422508e-7;
    }

    public double FromSquareInchesToAres(double sqin) {
        return sqin * 0.0000064516;
    }

    public double FromSquareInchesToHectares(double sqin) {
        return sqin * 6.45160000e-8;
    }

    public double FromSquareInchesToSquareCentimetres(double sqin) {
        return sqin * 6.4516;
    }

    public double FromSquareInchesToSquareFeet(double sqin) {
        return sqin * 0.0069444444;
    }

    public double FromSquareInchesToSquareMetres(double sqin) {
        return sqin * 0.00064516;
    }

    /* converting from square metres to all */
    public double FromSquareMetresToSquareMetres(double sqm) {
        return sqm;
    }

    public double FromSquareMetresToAcres(double sqm) {
        return sqm * 0.0002471054;
    }

    public double FromSquareMetresToAres(double sqm) {
        return sqm * 0.01;
    }

    public double FromSquareMetresToHectares(double sqm) {
        return sqm * 0.0001;
    }

    public double FromSquareMetresToSquareCentimetres(double sqm) {
        return sqm * 10000;
    }

    public double FromSquareMetresToSquareFeet(double sqm) {
        return sqm * 10.7639104167;
    }

    public double FromSquareMetresToSquareInches(double sqm) {
        return sqm * 1550.0031000062;
    }
}
