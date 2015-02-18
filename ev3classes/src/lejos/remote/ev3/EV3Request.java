package lejos.remote.ev3;

import java.io.File;
import java.io.Serializable;

import lejos.hardware.lcd.Image;

public class EV3Request implements Serializable {
	private static final long serialVersionUID = 3277625894143478775L;

	public enum Request {
		GET_VOLTAGE_MILLIVOLTS,
		GET_VOLTAGE,
		GET_BATTERY_CURRENT,
		GET_MOTOR_CURRENT,
		SYSTEM_SOUND,
		PLAY_TONE_VOL,
		PLAY_TONE,
		PLAY_SAMPLE_VOL,
		PLAY_SAMPLE,
		PLAY_SAMPLE_DATA,
		PLAY_NOTE,
		SET_VOLUME,
		GET_VOLUME,
		GET_NAME,
		LED_PATTERN,
		DISCARD_EVENTS,
		WAIT_FOR_ANY_EVENT,
		WAIT_FOR_ANY_PRESS,
		GET_BUTTONS,
		READ_BUTTONS,
		LCD_REFRESH,
		LCD_CLEAR,
		LCD_GET_WIDTH,
		LCD_GET_HEIGHT,
		LCD_GET_DISPLAY,
		LCD_GET_HW_DISPLAY,
		LCD_BITBLT_1,
		LCD_BITBLT_2,
		LCD_SET_AUTO_REFRESH,
		LCD_SET_AUTO_REFRESH_PERIOD,
		LCD_DRAW_CHAR,
		LCD_DRAW_STRING_INVERTED,
		LCD_DRAW_STRING,
		LCD_DRAW_INT,
		LCD_DRAW_INT_PLACES,
		LCD_CLEAR_LINES,
		LCD_CLEAR_LINE,
		LCD_SCROLL,
		LCD_GET_FONT,
		LCD_GET_TEXT_WIDTH,
		LCD_GET_TEXT_HEIGHT,
		OPEN_MOTOR_PORT,
		CLOSE_MOTOR_PORT,
		CONTROL_MOTOR,
		GET_TACHO_COUNT,
		RESET_TACHO_COUNT,
		KEY_IS_DOWN,
		KEY_WAIT_FOR_PRESS,
		KEY_WAIT_FOR_PRESS_AND_RELEASE,
		KEY_SIMULATE_EVENT,
		OPEN_ANALOG_PORT,
		CLOSE_SENSOR_PORT,
		GET_PIN_6,
		GET_PIN_1,
		SET_PIN_MODE,
		GET_FLOATS,
		LCD_G_COPY_AREA,
		LCD_G_SET_PIXEL,
		LCD_G_GET_PIXEL,
		LCD_G_DRAW_STRING,
		LCD_G_DRAW_STRING_INVERTED,
		LCD_G_DRAW_CHAR,
		LCD_G_DRAW_SUBSTRING,
		LCD_G_DRAW_CHARS,
		LCD_G_GET_STROKE_STYLE,
		LCD_G_SET_STROKE_STYLE,
		LCD_G_DRAW_REGION_ROP,
		LCD_G_DRAW_REGION_ROP_TRANSFORM,
		LCD_G_DRAW_REGION,
		LCD_G_DRAW_IMAGE,
		LCD_G_DRAW_LINE,
		LCD_G_DRAW_ARC,
		LCD_G_FILL_ARC,
		LCD_G_DRAW_ROUND_RECT,
		LCD_G_DRAW_RECT,
		LCD_G_FILL_RECT,
		LCD_G_TRANSLATE,
		LCD_G_GET_TRANSLATE_X,
		LCD_G_GET_TRANSLATE_Y,
		I2C_TRANSACTION,
		UART_GET_BYTE,
		UART_GET_BYTES,
		UART_GET_SHORT,
		UART_GET_SHORTS,
		UART_INITIALISE_SENSOR,
		UART_RESET_SENSOR,
		UART_GET_MODE_NAME,
		UART_SET_MODE,
		OPEN_I2C_PORT,
		OPEN_UART_PORT,
		CREATE_REGULATED_MOTOR,
		MOTOR_FORWARD,
		MOTOR_BACKWARD,
		MOTOR_STOP,
		MOTOR_FLT,
		MOTOR_IS_MOVING,
		MOTOR_GET_ROTATION_SPEED,
		MOTOR_GET_TACHO_COUNT,
		MOTOR_RESET_TACHO_COUNT,
		MOTOR_STOP_IMMEDIATE,
		MOTOR_FLT_IMMEDIATE,
		MOTOR_WAIT_COMPLETE,
		MOTOR_ROTATE,
		MOTOR_ROTATE_IMMEDIATE,
		MOTOR_ROTATE_TO,
		MOTOR_ROTATE_TO_IMMEDIATE,
		MOTOR_GET_LIMIT_ANGLE,
		MOTOR_GET_SPEED,
		MOTOR_SET_SPEED,
		MOTOR_GET_MAX_SPEED,
		MOTOR_IS_STALLED,
		MOTOR_SET_STALL_THRESHOLD,
		MOTOR_SET_ACCELERATION,
		MOTOR_CLOSE,
		CREATE_SAMPLE_PROVIDER,
		SAMPLE_SIZE,
		FETCH_SAMPLE,
		CLOSE_SENSOR,
		PILOT_GET_MIN_RADIUS,
		PILOT_SET_MIN_RADIUS,
		PILOT_ARC_FORWARD,
		PILOT_ARC_BACKWARD,
		PILOT_ARC,
		PILOT_ARC_IMMEDIATE,
		PILOT_TRAVEL_ARC,
		PILOT_TRAVEL_ARC_IMMEDIATE,
		PILOT_FORWARD,
		PILOT_BACKWARD,
		PILOT_STOP,
		PILOT_IS_MOVING,
		PILOT_TRAVEL,
		PILOT_TRAVEL_IMMEDIATE,
		PILOT_SET_TRAVEL_SPEED,
		PILOT_GET_TRAVEL_SPEED,
		PILOT_GET_MAX_TRAVEL_SPEED,
		PILOT_SET_ACCELERATION,
		PILOT_GET_ACCELERATION,
		PILOT_GET_MOVEMENT,
		PILOT_ROTATE,
		PILOT_ROTATE_IMMEDIATE,
		PILOT_GET_ROTATE_SPEED,
		PILOT_SET_ROTATE_SPEED,
		PILOT_GET_MAX_ROTATE_SPEED,
		PILOT_STEER,
		CREATE_PILOT,
		CLOSE_PILOT,
		CREATE_SAMPLE_PROVIDER_PUBLISH,
		UART_RAW_READ,
		UART_RAW_WRITE,
		UART_SET_BIT_RATE
	}
	
	public Request request;
	
	public boolean replyRequired;
	
	public int intValue, intValue2, intValue3, intValue4, intValue5, intValue6, intValue7, intValue8, intValue9, intValue10, intValue11;
	
	public File file;
	
	public byte[] byteData, byteData2;
	
	public int[] intData;
	
	public boolean flag;
	
	public String str, str2, str3, str4;
	
	public char ch;
	
	public char[] chars;
	
	public Image image;
	
	public double doubleValue, doubleValue2;
	
	public float floatValue;

}
