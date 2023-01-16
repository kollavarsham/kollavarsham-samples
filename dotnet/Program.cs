using System;
using KollavarshamOrg;

namespace Test
{
    class Program
    {
        static void Main(string[] args)
        {
            var settings = new Settings {
                Latitude = 10,
                Longitude = 76.2,
                System = "SuryaSiddhanta"
            };
            var kv = new Kollavarsham(settings);
            var today = kv.FromGregorianDate(DateTime.Now);
            Console.WriteLine($"{today.Year.ToString()} {today.MlMasaName} {today.Date.ToString()} ({today.MlNaksatraName})");
        }
    }
}
