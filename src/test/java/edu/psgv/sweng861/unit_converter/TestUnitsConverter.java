package edu.psgv.sweng861.unit_converter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.junit.jupiter.api.Test;

public class TestUnitsConverter {

	public String normalizeExpectedOutput(String expectedOutput) {
		String normExpectedOutput;
		String[] outputs = expectedOutput.split("\n");
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		for (String str : outputs) {
			pw.println(str);
		}
		pw.close();
		normExpectedOutput = sw.toString();
		return normExpectedOutput;
	}

	@Test
//	test the main method for the input with millimeter unit
	public void testMainMethodForMm() {
		// simulated input
		String input = "1 mm";
		InputStream sysIn = System.in;
		PrintStream sysOut = System.out;
		InputStream myIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(myIn);
		final String unNormalizedExpectedOutput = "Please Enter the input value followed by the unit:\n" + "1 mm is:\n"
				+ "39 mil\n" + "0.039 inch\n" + "0.0033 ft\n" + "0.0011 yard\n" + "6.2e-07 mile";
		final String expectedOutput = normalizeExpectedOutput(unNormalizedExpectedOutput);
		// This is the technique to capture the textual output
		// from System.out.print calls.
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		UnitsConvertor.main(null);
		final String printResult = myOut.toString();
		assertEquals(expectedOutput, printResult);
		// return System variables to their previous values.

		System.setOut(sysOut);
		System.setIn(sysIn);
	}

	@Test
//	test the main method for the input with centimeter unit
	public void testMainMethodForCm() {
		// simulated input
		String input = "1 cm";
		InputStream sysIn = System.in;
		PrintStream sysOut = System.out;
		InputStream myIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(myIn);
		final String unNormalizedExpectedOutput = "Please Enter the input value followed by the unit:\n" + "1 cm is:\n"
				+ "3.9e+02 mil\n" + "0.39 inch\n" + "0.033 ft\n" + "0.011 yard\n" + "6.2e-06 mile";
		final String expectedOutput = normalizeExpectedOutput(unNormalizedExpectedOutput);
		// This is the technique to capture the textual output
		// from System.out.print calls.
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		UnitsConvertor.main(null);
		final String printResult = myOut.toString();
		assertEquals(expectedOutput, printResult);
		// return System variables to their previous values.
		System.setOut(sysOut);
		System.setIn(sysIn);
	}

	@Test
//	test the main method for the input with Meter unit
	public void testMainMethodForM() {
		// simulated input
		String input = "1 m";
		InputStream sysIn = System.in;
		PrintStream sysOut = System.out;
		InputStream myIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(myIn);
		final String unNormalizedExpectedOutput = "Please Enter the input value followed by the unit:\n" + "1 m is:\n"
				+ "3.9e+04 mil\n" + "39 inch\n" + "3.3 ft\n" + "1.1 yard\n" + "0.00062 mile";
		final String expectedOutput = normalizeExpectedOutput(unNormalizedExpectedOutput);
		// This is the technique to capture the textual output
		// from System.out.print calls.
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		UnitsConvertor.main(null);
		final String printResult = myOut.toString();
		assertEquals(expectedOutput, printResult);
		// return System variables to their previous values.
		System.setOut(sysOut);
		System.setIn(sysIn);
	}

	@Test
//	test the main method for the input with kilometer unit
	public void testMainMethodForKm() {
		// simulated input
		String input = "1 km";
		InputStream sysIn = System.in;
		PrintStream sysOut = System.out;
		InputStream myIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(myIn);
		final String unNormalizedExpectedOutput = "Please Enter the input value followed by the unit:\n" + "1 km is:\n"
				+ "3.9e+07 mil\n" + "3.9e+04 inch\n" + "3.3e+03 ft\n" + "1.1e+03 yard\n" + "0.62 mile";
		final String expectedOutput = normalizeExpectedOutput(unNormalizedExpectedOutput);
		// This is the technique to capture the textual output
		// from System.out.print calls.
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		UnitsConvertor.main(null);
		final String printResult = myOut.toString();
		assertEquals(expectedOutput, printResult);
		// return System variables to their previous values.
		System.setOut(sysOut);
		System.setIn(sysIn);
	}

	@Test
//	test the main method for the input with mile unit
	public void testMainMethodForMil() {
		// simulated input
		String input = "1 mil";
		InputStream sysIn = System.in;
		PrintStream sysOut = System.out;
		InputStream myIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(myIn);
		final String unNormalizedExpectedOutput = "Please Enter the input value followed by the unit:\n" + "1 mil is:\n"
				+ "0.025400 mm\n" + "0.002540 cm\n" + "0.000025 m\n" + "0.000000 km";
		final String expectedOutput = normalizeExpectedOutput(unNormalizedExpectedOutput);
		// This is the technique to capture the textual output
		// from System.out.print calls.
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		UnitsConvertor.main(null);
		final String printResult = myOut.toString();
		assertEquals(expectedOutput, printResult);
		// return System variables to their previous values.
		System.setOut(sysOut);
		System.setIn(sysIn);
	}

	@Test
//	test the main method for the input with inch unit
	public void testMainMethodForIn() {
		// simulated input
		String input = "1 in";
		InputStream sysIn = System.in;
		PrintStream sysOut = System.out;
		InputStream myIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(myIn);
		final String unNormalizedExpectedOutput = "Please Enter the input value followed by the unit:\n" + "1 in is:\n"
				+ "25.400000 mm\n" + "2.540000 cm\n" + "0.025400 m\n" + "0.000025 km";
		final String expectedOutput = normalizeExpectedOutput(unNormalizedExpectedOutput);
		// This is the technique to capture the textual output
		// from System.out.print calls.
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		UnitsConvertor.main(null);
		final String printResult = myOut.toString();
		assertEquals(expectedOutput, printResult);
		// return System variables to their previous values.
		System.setOut(sysOut);
		System.setIn(sysIn);
	}

	@Test
//	test the main method for the input with feet unit
	public void testMainMethodForFt() {
		// simulated input
		String input = "1 ft";
		InputStream sysIn = System.in;
		PrintStream sysOut = System.out;
		InputStream myIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(myIn);
		final String unNormalizedExpectedOutput = "Please Enter the input value followed by the unit:\n" + "1 ft is:\n"
				+ "304.800000 mm\n" + "30.480000 cm\n" + "0.304800 m\n" + "0.000305 km";
		final String expectedOutput = normalizeExpectedOutput(unNormalizedExpectedOutput);
		// This is the technique to capture the textual output
		// from System.out.print calls.
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		UnitsConvertor.main(null);
		final String printResult = myOut.toString();
		assertEquals(expectedOutput, printResult);
		// return System variables to their previous values.
		System.setOut(sysOut);
		System.setIn(sysIn);
	}

	@Test
//	test the main method for the input with mi unit
	public void testMainMethodForMi() {
		// simulated input
		String input = "1 mi";
		InputStream sysIn = System.in;
		PrintStream sysOut = System.out;
		InputStream myIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(myIn);
		final String unNormalizedExpectedOutput = "Please Enter the input value followed by the unit:\n" + "1 mi is:\n"
				+ "1609344.000000 mm\n" + "160934.400000 cm\n" + "1609.344000 m\n" + "1.609344 km";
		final String expectedOutput = normalizeExpectedOutput(unNormalizedExpectedOutput);
		// This is the technique to capture the textual output
		// from System.out.print calls.
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		UnitsConvertor.main(null);
		final String printResult = myOut.toString();
		assertEquals(expectedOutput, printResult);
		// return System variables to their previous values.
		System.setOut(sysOut);
		System.setIn(sysIn);
	}

	@Test
//	test the main method for the input with yard unit
	public void testMainMethodForYd() {
		// simulated input
		String input = "1 yd";
		InputStream sysIn = System.in;
		PrintStream sysOut = System.out;
		InputStream myIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(myIn);
		final String unNormalizedExpectedOutput = "Please Enter the input value followed by the unit:\n" + "1 yd is:\n"
				+ "914.400000 mm\n" + "91.440000 cm\n" + "0.914400 m\n" + "0.000914 km";
		final String expectedOutput = normalizeExpectedOutput(unNormalizedExpectedOutput);
		// This is the technique to capture the textual output
		// from System.out.print calls.
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		UnitsConvertor.main(null);
		final String printResult = myOut.toString();
		assertEquals(expectedOutput, printResult);
		// return System variables to their previous values.
		System.setOut(sysOut);
		System.setIn(sysIn);
	}

	@Test
//	test the main method for the input with an invalid unit
	public void testMainMethodForInvalidUnit() {
		// simulated input
		String input = "1 pr";
		InputStream sysIn = System.in;
		PrintStream sysOut = System.out;
		InputStream myIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(myIn);
		final String unNormalizedUnExpectedOutput = "enter valid input";
		final String expectedOutput = normalizeExpectedOutput(unNormalizedUnExpectedOutput);
		// This is the technique to capture the textual output
		// from System.out.print calls.
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));

		UnitsConvertor.main(null);
		final String printResult = myOut.toString();
		assertNotEquals(expectedOutput, printResult);
		// return System variables to their previous values.
		System.setOut(sysOut);
		System.setIn(sysIn);
	}

	@Test
//	test the main method for invalid input
	public void testMainMethodForInvalidInput() {
		// simulated input
		String input = "1ch";
		InputStream sysIn = System.in;
		PrintStream sysOut = System.out;
		InputStream myIn = new ByteArrayInputStream(input.getBytes());
		System.setIn(myIn);
		final String unNormalizedUnExpectedOutput = "enter valid input";
		final String expectedOutput = normalizeExpectedOutput(unNormalizedUnExpectedOutput);
		// This is the technique to capture the textual output
		// from System.out.print calls.
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		System.setOut(new PrintStream(myOut));
		UnitsConvertor.main(null);
		final String printResult = myOut.toString();
		assertNotEquals(expectedOutput, printResult);
		// return System variables to their previous values.
		System.setOut(sysOut);
		System.setIn(sysIn);
	}

	@Test
	// testcase to verify the output of toMm method
	public void testToMmImperialUnits() {
		assertEquals(25.4, UnitsConvertor.toMm(1, "inch"));
		assertEquals(304.8, UnitsConvertor.toMm(1, "ft"));
	}

	@Test
	// testcase to verify the output of toMm method is not showing wrong output
	public void testToWrongMmImperialUnits() {
		assertNotEquals(1, UnitsConvertor.toMm(1, "inch"));
		assertNotEquals(1, UnitsConvertor.toMm(1, "ft"));
		assertNotEquals(1, UnitsConvertor.toMm(1, "yd"));
		assertNotEquals(1, UnitsConvertor.toMm(1, "mil"));
		assertNotEquals(1, UnitsConvertor.toMm(1, "mi"));

	}

	@Test
	// testcase to verify the output of toMil method is not showing wrong output
	public void testToMmMixingUnits() {
		assertNotEquals(3.9e+02, UnitsConvertor.toMil(1, "cm"));
		assertNotEquals(3.9e+07, UnitsConvertor.toMil(1, "km"));
		assertNotEquals(2, UnitsConvertor.toMil(1, "m"));
		assertNotEquals(2, UnitsConvertor.toMil(1, "mm"));
	}

	@Test
	// testcase to verify the invalid input scenario of toMm method
	public void testToMmWithInvalidInput() {
		assertThrows(IllegalArgumentException.class, () -> UnitsConvertor.toMm(1, "Illegal unit value."));
	}

	// testcase to verify the invalid input scenario of toMil method
	@Test
	public void testToMilWithInvalidInput() {
		assertThrows(IllegalArgumentException.class, () -> UnitsConvertor.toMil(1, "Bad unit value"));
	}

}
