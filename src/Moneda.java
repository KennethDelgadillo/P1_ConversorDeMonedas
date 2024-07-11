public record Moneda(double conversion_rate) {
    @Override
    public double conversion_rate() {
        return conversion_rate;
    }
}
