# ikonli-razer-pack

An [Ikonli](https://github.com/kordamp/ikonli) pack for Razer devices. Based on my [razer-icon-font](https://github.com/kordamp/ikonli).

## Usage

The pack is in Maven Central. Add the following to your POM (or other build system that uses Maven repositories).

```xml
<dependency>
    <groupId>uk.co.bithatch</groupId>
    <artifactId>ikonli-razer-pack</artifactId>
    <version>0.0.1</version>
</dependency>
```

Then add the appropriate toolkit library such as `org.kordamp.ikonli:ikonli-javafx`, and use in your project with `FontIcon` and friends. See Ikonli documentation for more information.