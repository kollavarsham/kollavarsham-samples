package main

import (
	"fmt"
	"time"

	"github.com/kollavarsham/kollavarsham-go/converter/v2"
)

func main() {

	latitude := float64(23.2)
	longitude := float64(75.8)
	system := "SuryaSiddhanta"
	kv := converter.NewKollavarsham(&converter.Settings{
		Latitude:  &latitude,
		Longitude: &longitude,
		System:    &system,
	})

	now := time.Now()
	today := kv.FromGregorianDate(&now)

	fmt.Printf("Today in Malayalam Year: %v %v %v (%v)\n", *today.Year(), *today.MlMasaName(), *today.Date(), *today.MlNaksatraName())
}
