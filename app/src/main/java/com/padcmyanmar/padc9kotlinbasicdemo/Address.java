package com.padcmyanmar.padc9kotlinbasicdemo;

import java.util.Objects;

public class Address {
    private final String mHomeAddress;
    private final String mTownship;

    public Address(String mHomeAddress, String mTownship) {
        this.mHomeAddress = mHomeAddress;
        this.mTownship = mTownship;
    }

    public String getHomeAddress() {
        return mHomeAddress;
    }

    public String getTownship() {
        return mTownship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(mHomeAddress, address.mHomeAddress) &&
                Objects.equals(mTownship, address.mTownship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mHomeAddress, mTownship);
    }

    @Override
    public String toString() {
        return "Address{" +
                "mHomeAddress='" + mHomeAddress + '\'' +
                ", mTownship='" + mTownship + '\'' +
                '}';
    }
}
