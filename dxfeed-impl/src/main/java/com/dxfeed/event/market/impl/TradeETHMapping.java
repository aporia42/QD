/*
 * !++
 * QDS - Quick Data Signalling Library
 * !-
 * Copyright (C) 2002 - 2017 Devexperts LLC
 * !-
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, You can obtain one at
 * http://mozilla.org/MPL/2.0/.
 * !__
 */
package com.dxfeed.event.market.impl;

import com.devexperts.qd.DataRecord;
import com.devexperts.qd.ng.RecordCursor;
import com.devexperts.qd.util.Decimal;
import com.devexperts.qd.util.MappingUtil;
import com.devexperts.util.TimeUtil;

public class TradeETHMapping extends MarketEventMapping {
// BEGIN: CODE AUTOMATICALLY GENERATED: DO NOT MODIFY. IT IS REGENERATED BY com.dxfeed.api.codegen.ImplCodeGen
	private final int iTime;
	private final int iSequence;
	private final int iTimeNanoPart;
	private final int iExchangeCode;
	private final int iPrice;
	private final int iSize;
	private final int iFlags;
	private final int iDayVolume;
	private final int iDayTurnover;

	public TradeETHMapping(DataRecord record) {
		super(record);
		iTime = MappingUtil.findIntField(record, "ETHLast.Time", false);
		iSequence = MappingUtil.findIntField(record, "ETHLast.Sequence", false);
		iTimeNanoPart = MappingUtil.findIntField(record, "Last.TimeNanoPart", false);
		iExchangeCode = MappingUtil.findIntField(record, "ETHLast.Exchange", false);
		iPrice = MappingUtil.findIntField(record, "ETHLast.Price", true);
		iSize = MappingUtil.findIntField(record, "ETHLast.Size", true);
		iFlags = MappingUtil.findIntField(record, "ETHLast.Flags", true);
		iDayVolume = MappingUtil.findIntField(record, "ETHVolume", false);
		iDayTurnover = MappingUtil.findIntField(record, "ETHDayTurnover", false);
		putNonDefaultPropertyName("ETHLast.Time", "Time");
		putNonDefaultPropertyName("ETHLast.Sequence", "Sequence");
		putNonDefaultPropertyName("Last.TimeNanoPart", "TimeNanoPart");
		putNonDefaultPropertyName("ETHLast.Exchange", "ExchangeCode");
		putNonDefaultPropertyName("ETHLast.Price", "Price");
		putNonDefaultPropertyName("ETHLast.Size", "Size");
		putNonDefaultPropertyName("ETHLast.Flags", "Flags");
		putNonDefaultPropertyName("ETHVolume", "DayVolume");
		putNonDefaultPropertyName("ETHDayTurnover", "DayTurnover");
	}

	@Deprecated
	public long getETHLastTimeMillis(RecordCursor cursor) {
		if (iTime < 0)
			return 0;
		return getInt(cursor, iTime) * 1000L;
	}

	@Deprecated
	public void setETHLastTimeMillis(RecordCursor cursor, long _ETHLastTime) {
		if (iTime < 0)
			return;
		setInt(cursor, iTime, TimeUtil.getSecondsFromTime(_ETHLastTime));
	}

	@Deprecated
	public int getETHLastTimeSeconds(RecordCursor cursor) {
		if (iTime < 0)
			return 0;
		return getInt(cursor, iTime);
	}

	@Deprecated
	public void setETHLastTimeSeconds(RecordCursor cursor, int _ETHLastTime) {
		if (iTime < 0)
			return;
		setInt(cursor, iTime, _ETHLastTime);
	}

	public long getTimeMillis(RecordCursor cursor) {
		if (iTime < 0)
			return 0;
		return getInt(cursor, iTime) * 1000L;
	}

	public void setTimeMillis(RecordCursor cursor, long time) {
		if (iTime < 0)
			return;
		setInt(cursor, iTime, TimeUtil.getSecondsFromTime(time));
	}

	public int getTimeSeconds(RecordCursor cursor) {
		if (iTime < 0)
			return 0;
		return getInt(cursor, iTime);
	}

	public void setTimeSeconds(RecordCursor cursor, int time) {
		if (iTime < 0)
			return;
		setInt(cursor, iTime, time);
	}

	@Deprecated
	public int getETHLastSequence(RecordCursor cursor) {
		if (iSequence < 0)
			return 0;
		return getInt(cursor, iSequence);
	}

	@Deprecated
	public void setETHLastSequence(RecordCursor cursor, int _ETHLastSequence) {
		if (iSequence < 0)
			return;
		setInt(cursor, iSequence, _ETHLastSequence);
	}

	public int getSequence(RecordCursor cursor) {
		if (iSequence < 0)
			return 0;
		return getInt(cursor, iSequence);
	}

	public void setSequence(RecordCursor cursor, int sequence) {
		if (iSequence < 0)
			return;
		setInt(cursor, iSequence, sequence);
	}

	@Deprecated
	public int getLastTimeNanoPart(RecordCursor cursor) {
		if (iTimeNanoPart < 0)
			return 0;
		return getInt(cursor, iTimeNanoPart);
	}

	@Deprecated
	public void setLastTimeNanoPart(RecordCursor cursor, int lastTimeNanoPart) {
		if (iTimeNanoPart < 0)
			return;
		setInt(cursor, iTimeNanoPart, lastTimeNanoPart);
	}

	public int getTimeNanoPart(RecordCursor cursor) {
		if (iTimeNanoPart < 0)
			return 0;
		return getInt(cursor, iTimeNanoPart);
	}

	public void setTimeNanoPart(RecordCursor cursor, int timeNanoPart) {
		if (iTimeNanoPart < 0)
			return;
		setInt(cursor, iTimeNanoPart, timeNanoPart);
	}

	@Deprecated
	public char getETHLastExchange(RecordCursor cursor) {
		if (iExchangeCode < 0)
			return recordExchange;
		return (char)getInt(cursor, iExchangeCode);
	}

	@Deprecated
	public void setETHLastExchange(RecordCursor cursor, char _ETHLastExchange) {
		if (iExchangeCode < 0)
			return;
		setInt(cursor, iExchangeCode, _ETHLastExchange);
	}

	public char getExchangeCode(RecordCursor cursor) {
		if (iExchangeCode < 0)
			return recordExchange;
		return (char)getInt(cursor, iExchangeCode);
	}

	public void setExchangeCode(RecordCursor cursor, char exchangeCode) {
		if (iExchangeCode < 0)
			return;
		setInt(cursor, iExchangeCode, exchangeCode);
	}

	@Deprecated
	public double getETHLastPrice(RecordCursor cursor) {
		return Decimal.toDouble(getInt(cursor, iPrice));
	}

	@Deprecated
	public void setETHLastPrice(RecordCursor cursor, double _ETHLastPrice) {
		setInt(cursor, iPrice, Decimal.compose(_ETHLastPrice));
	}

	@Deprecated
	public int getETHLastPriceDecimal(RecordCursor cursor) {
		return getInt(cursor, iPrice);
	}

	@Deprecated
	public void setETHLastPriceDecimal(RecordCursor cursor, int _ETHLastPrice) {
		setInt(cursor, iPrice, _ETHLastPrice);
	}

	public double getPrice(RecordCursor cursor) {
		return Decimal.toDouble(getInt(cursor, iPrice));
	}

	public void setPrice(RecordCursor cursor, double price) {
		setInt(cursor, iPrice, Decimal.compose(price));
	}

	public int getPriceDecimal(RecordCursor cursor) {
		return getInt(cursor, iPrice);
	}

	public void setPriceDecimal(RecordCursor cursor, int price) {
		setInt(cursor, iPrice, price);
	}

	@Deprecated
	public int getETHLastSize(RecordCursor cursor) {
		return getInt(cursor, iSize);
	}

	@Deprecated
	public void setETHLastSize(RecordCursor cursor, int _ETHLastSize) {
		setInt(cursor, iSize, _ETHLastSize);
	}

	public int getSize(RecordCursor cursor) {
		return getInt(cursor, iSize);
	}

	public void setSize(RecordCursor cursor, int size) {
		setInt(cursor, iSize, size);
	}

	@Deprecated
	public int getETHLastFlags(RecordCursor cursor) {
		return getInt(cursor, iFlags);
	}

	@Deprecated
	public void setETHLastFlags(RecordCursor cursor, int _ETHLastFlags) {
		setInt(cursor, iFlags, _ETHLastFlags);
	}

	public int getFlags(RecordCursor cursor) {
		return getInt(cursor, iFlags);
	}

	public void setFlags(RecordCursor cursor, int flags) {
		setInt(cursor, iFlags, flags);
	}

	@Deprecated
	public long getETHVolume(RecordCursor cursor) {
		if (iDayVolume < 0)
			return 0;
		return (long)Decimal.toDouble(getInt(cursor, iDayVolume));
	}

	@Deprecated
	public void setETHVolume(RecordCursor cursor, long _ETHVolume) {
		if (iDayVolume < 0)
			return;
		setInt(cursor, iDayVolume, Decimal.composeDecimal(_ETHVolume, 0));
	}

	@Deprecated
	public double getETHVolumeDouble(RecordCursor cursor) {
		if (iDayVolume < 0)
			return Double.NaN;
		return Decimal.toDouble(getInt(cursor, iDayVolume));
	}

	@Deprecated
	public void setETHVolumeDouble(RecordCursor cursor, double _ETHVolume) {
		if (iDayVolume < 0)
			return;
		setInt(cursor, iDayVolume, Decimal.compose(_ETHVolume));
	}

	@Deprecated
	public int getETHVolumeDecimal(RecordCursor cursor) {
		if (iDayVolume < 0)
			return 0;
		return getInt(cursor, iDayVolume);
	}

	@Deprecated
	public void setETHVolumeDecimal(RecordCursor cursor, int _ETHVolume) {
		if (iDayVolume < 0)
			return;
		setInt(cursor, iDayVolume, _ETHVolume);
	}

	public long getDayVolume(RecordCursor cursor) {
		if (iDayVolume < 0)
			return 0;
		return (long)Decimal.toDouble(getInt(cursor, iDayVolume));
	}

	public void setDayVolume(RecordCursor cursor, long dayVolume) {
		if (iDayVolume < 0)
			return;
		setInt(cursor, iDayVolume, Decimal.composeDecimal(dayVolume, 0));
	}

	public double getDayVolumeDouble(RecordCursor cursor) {
		if (iDayVolume < 0)
			return Double.NaN;
		return Decimal.toDouble(getInt(cursor, iDayVolume));
	}

	public void setDayVolumeDouble(RecordCursor cursor, double dayVolume) {
		if (iDayVolume < 0)
			return;
		setInt(cursor, iDayVolume, Decimal.compose(dayVolume));
	}

	public int getDayVolumeDecimal(RecordCursor cursor) {
		if (iDayVolume < 0)
			return 0;
		return getInt(cursor, iDayVolume);
	}

	public void setDayVolumeDecimal(RecordCursor cursor, int dayVolume) {
		if (iDayVolume < 0)
			return;
		setInt(cursor, iDayVolume, dayVolume);
	}

	@Deprecated
	public double getETHDayTurnover(RecordCursor cursor) {
		if (iDayTurnover < 0)
			return Double.NaN;
		return Decimal.toDouble(getInt(cursor, iDayTurnover));
	}

	@Deprecated
	public void setETHDayTurnover(RecordCursor cursor, double _ETHDayTurnover) {
		if (iDayTurnover < 0)
			return;
		setInt(cursor, iDayTurnover, Decimal.compose(_ETHDayTurnover));
	}

	@Deprecated
	public int getETHDayTurnoverDecimal(RecordCursor cursor) {
		if (iDayTurnover < 0)
			return 0;
		return getInt(cursor, iDayTurnover);
	}

	@Deprecated
	public void setETHDayTurnoverDecimal(RecordCursor cursor, int _ETHDayTurnover) {
		if (iDayTurnover < 0)
			return;
		setInt(cursor, iDayTurnover, _ETHDayTurnover);
	}

	public double getDayTurnover(RecordCursor cursor) {
		if (iDayTurnover < 0)
			return Double.NaN;
		return Decimal.toDouble(getInt(cursor, iDayTurnover));
	}

	public void setDayTurnover(RecordCursor cursor, double dayTurnover) {
		if (iDayTurnover < 0)
			return;
		setInt(cursor, iDayTurnover, Decimal.compose(dayTurnover));
	}

	public int getDayTurnoverDecimal(RecordCursor cursor) {
		if (iDayTurnover < 0)
			return 0;
		return getInt(cursor, iDayTurnover);
	}

	public void setDayTurnoverDecimal(RecordCursor cursor, int dayTurnover) {
		if (iDayTurnover < 0)
			return;
		setInt(cursor, iDayTurnover, dayTurnover);
	}
// END: CODE AUTOMATICALLY GENERATED
}
