using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LP2Clinica
{
    public partial class frmLogin : Form
    {
        public frmLogin()
        {
            InitializeComponent();
        }

        private void btnLogin_Click(object sender, EventArgs e)
        {
            //se verifica en la tabla que tipo de usuario es 
            // se hace una variable "tipo de usuario" en el menú principal y se hace 
            // una clase de "cambiar estado componentes"
            //nos llevará al menu principal
        }



        private void lblCambiarPassword_Click(object sender, EventArgs e)
        {
            // Provisionalmente pondremos esta pantalla de "modificarContraseña" 
            frmModificarContraseña modificarContraseña = new frmModificarContraseña();
            modificarContraseña.Show();
            this.Close();
        }

        private void btnRegistro_Click(object sender, EventArgs e)
        {

        }
    }
}
